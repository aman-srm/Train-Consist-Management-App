package app.src;

import java.util.HashSet;

public class Train_Consist_Management_App {

    public static void main(String[] args) {

        // Create HashSet for bogie IDs (ensures uniqueness)
        HashSet<String> bogieIDs = new HashSet<>();

        // Adding bogie IDs
        bogieIDs.add("B101");
        bogieIDs.add("B102");
        bogieIDs.add("B103");

        // Attempt to add duplicate IDs
        bogieIDs.add("B102"); // Duplicate
        bogieIDs.add("B101"); // Duplicate

        // Display unique bogie IDs
        System.out.println("Unique Bogie IDs in Train:");
        for (String id : bogieIDs) {
            System.out.println(id);
        }

        // Demonstrating add() return behavior
        boolean isAdded = bogieIDs.add("B103"); // Already exists
        if (!isAdded) {
            System.out.println("\nDuplicate ID 'B103' was ignored.");
        }

        // Final set state
        System.out.println("\nFinal Bogie ID Set:");
        System.out.println(bogieIDs);
    }
}