package app.src;

import java.util.HashMap;
import java.util.Map;

public class Train_Consist_Management_App {

    public static void main(String[] args) {

        // Create HashMap for bogie-capacity mapping
        HashMap<String, Integer> bogieCapacity = new HashMap<>();

        // Insert bogie capacities
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 60);
        bogieCapacity.put("First Class", 24);

        // Display all bogie-capacity mappings
        System.out.println("Bogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() + 
                               " | Capacity: " + entry.getValue());
        }

        // Example: Fast lookup using key
        String searchBogie = "Sleeper";
        if (bogieCapacity.containsKey(searchBogie)) {
            System.out.println("\nCapacity of " + searchBogie + " is: " 
                                + bogieCapacity.get(searchBogie));
        } else {
            System.out.println("\nBogie not found.");
        }
    }
}