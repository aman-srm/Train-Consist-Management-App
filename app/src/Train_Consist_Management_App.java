package app.src;

import java.util.LinkedHashSet;

public class Train_Consist_Management_App {

    public static void main(String[] args) {

        // Create LinkedHashSet for train formation
        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        // Add bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt to add duplicate bogie
        trainFormation.add("Sleeper"); // Duplicate (will be ignored)

        // Display formation
        System.out.println("Final Train Formation (No duplicates, Order preserved):");
        for (String bogie : trainFormation) {
            System.out.println(bogie);
        }

        // Final state using println
        System.out.println("\nFormation as list:");
        System.out.println(trainFormation);
    }
}