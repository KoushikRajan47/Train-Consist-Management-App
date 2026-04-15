package UC18;

public class UseCase18TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC18 - Linear Search for Bogie ID");
        System.out.println("====================================");

        // Step 1: Create array
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Step 2: Search ID
        String searchId = "BG309";

        // Step 3: Display all IDs
        System.out.println("\nAvailable Bogie IDs:");
        for (String id : bogieIds) {
            System.out.print(id + " ");
        }

        // Step 4: Perform search
        boolean found = SearchService.linearSearch(bogieIds, searchId);

        // Step 5: Display result
        if (found) {
            System.out.println("\n\nBogie ID " + searchId + " FOUND");
        } else {
            System.out.println("\n\nBogie ID " + searchId + " NOT FOUND");
        }
    }
}
