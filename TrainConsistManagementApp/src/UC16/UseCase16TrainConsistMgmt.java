package UC16;

public class UseCase16TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC16 - Bubble Sort (Manual Sorting)");
        System.out.println("====================================");

        // Step 1: Create array
        int[] capacities = {72, 56, 24, 70, 60};

        // Step 2: Display original array
        System.out.println("\nOriginal Capacities:");
        for (int c : capacities) {
            System.out.print(c + " ");
        }

        // Step 3: Sort using Bubble Sort
        SortingService.bubbleSort(capacities);

        // Step 4: Display sorted array
        System.out.println("\n\nSorted Capacities (Ascending):");
        for (int c : capacities) {
            System.out.print(c + " ");
        }
    }
}
