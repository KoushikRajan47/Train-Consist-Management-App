package UC7;

import java.util.ArrayList;
import java.util.List;

public class UseCase7TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC7 - Sort Bogies by Capacity");
        System.out.println("====================================");

        // Step 1: Create list
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 48));
        bogies.add(new Bogie("General", 90));

        // Step 2: Display unsorted list
        System.out.println("\nUnsorted Bogies:");
        bogies.forEach(System.out::println);

        // Step 3: Sort using Comparator
        TrainService.sortBogiesByCapacity(bogies);

        // Step 4: Display sorted list
        System.out.println("\nSorted Bogies (by Capacity):");
        bogies.forEach(System.out::println);
    }
}
