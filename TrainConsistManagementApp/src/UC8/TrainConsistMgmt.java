package UC8;

import java.util.ArrayList;
import java.util.List;

public class TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC8 - Filter Passenger Bogies Using Streams");
        System.out.println("====================================");

        // Step 1: Create list of bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 50));
        bogies.add(new Bogie("General", 90));

        int threshold = 70;

        // Step 2: Filter using Stream API
        List<Bogie> filteredBogies = TrainService.filterBogies(bogies, threshold);

        // Step 3: Display result
        System.out.println("\nFiltered Bogies (Capacity > " + threshold + "):");
        filteredBogies.forEach(System.out::println);

        // Verify original list unchanged
        System.out.println("\nOriginal Bogies:");
        bogies.forEach(System.out::println);
    }
}