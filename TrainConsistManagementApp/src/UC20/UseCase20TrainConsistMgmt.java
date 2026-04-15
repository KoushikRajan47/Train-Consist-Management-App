package UC20;

public class UseCase20TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC20 - Exception Handling in Search");
        System.out.println("====================================");

        // Example 1: Empty array (will throw exception)
        String[] bogieIds = {};

        String searchId = "BG101";

        try {
            boolean found = SearchService.searchWithValidation(bogieIds, searchId);

            if (found) {
                System.out.println("Bogie FOUND");
            } else {
                System.out.println("Bogie NOT FOUND");
            }

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Example 2: Valid case
        String[] validIds = {"BG101", "BG205", "BG309"};

        try {
            boolean found = SearchService.searchWithValidation(validIds, "BG205");

            System.out.println("\nSecond Search Result: " + (found ? "FOUND" : "NOT FOUND"));

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nProgram completed safely.");
    }
}