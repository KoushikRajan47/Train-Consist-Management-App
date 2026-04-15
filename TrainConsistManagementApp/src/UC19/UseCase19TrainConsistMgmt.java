package UC19;

import java.util.Arrays;

public class UseCase19TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC19 - Binary Search for Bogie ID");
        System.out.println("====================================");

        // Step 1: Create array (unsorted)
        String[] bogieIds = {"BG309", "BG101", "BG550", "BG205", "BG412"};

        // Step 2: Search key
        String key = "BG309";

        // Step 3: Display sorted array
        Arrays.sort(bogieIds);
        System.out.println("\nSorted Bogie IDs:");
        System.out.println(Arrays.toString(bogieIds));

        // Step 4: Perform binary search
        boolean found = SearchService.binarySearch(bogieIds, key);

        // Step 5: Display result
        if (found) {
            System.out.println("\nBogie ID " + key + " FOUND");
        } else {
            System.out.println("\nBogie ID " + key + " NOT FOUND");
        }
    }
}