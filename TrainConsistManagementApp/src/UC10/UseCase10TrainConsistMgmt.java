package UC10;

import java.util.ArrayList;
import java.util.List;

public class UseCase10TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC10 - Count Total Seats in Train");
        System.out.println("====================================");

        // Step 1: Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 70));

        // Step 2: Display bogies
        System.out.println("\nBogies in Train:");
        for (Bogie b : bogies) {
            System.out.println(b.getName() + " -> " + b.getCapacity());
        }

        // Step 3: Calculate total seats
        int totalSeats = TrainService.calculateTotalSeats(bogies);

        // Step 4: Display result
        System.out.println("\nTotal Seating Capacity: " + totalSeats);
    }
}
