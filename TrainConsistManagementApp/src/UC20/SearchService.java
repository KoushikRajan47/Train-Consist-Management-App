package UC20;

public class SearchService {

    public static boolean searchWithValidation(String[] bogieIds, String searchId) {

        // FAIL-FAST VALIDATION
        if (bogieIds == null || bogieIds.length == 0) {
            throw new IllegalStateException("No bogies available for search");
        }

        // LINEAR SEARCH (after validation)
        for (String id : bogieIds) {
            if (id.equals(searchId)) {
                return true;
            }
        }

        return false;
    }
}