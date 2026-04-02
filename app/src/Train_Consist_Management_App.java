package app.src;

import java.util.ArrayList;

public class Train_Consist_Management_App {

    public static void main(String[] args) {

        // Create ArrayList for passenger bogies
        ArrayList<String> bogies = new ArrayList<>();

        // Add bogies
        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("First Class");

        // Display bogies after insertion
        System.out.println("Bogies after addition:");
        System.out.println(bogies);

        // Remove a bogie (AC Chair)
        bogies.remove("AC Chair");

        // Display after removal
        System.out.println("\nBogies after removal of AC Chair:");
        System.out.println(bogies);

        // Check if Sleeper exists
        if (bogies.contains("Sleeper")) {
            System.out.println("\nSleeper bogie exists in the train.");
        } else {
            System.out.println("\nSleeper bogie does not exist in the train.");
        }

        // Final list state
        System.out.println("\nFinal bogie list:");
        System.out.println(bogies);
    }
}
