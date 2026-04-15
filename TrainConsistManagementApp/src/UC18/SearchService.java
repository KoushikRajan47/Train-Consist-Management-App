package UC18;

public class SearchService {

    public static boolean linearSearch(String[] bogieIds, String searchId) {

        for (String id : bogieIds) {

            if (id.equals(searchId)) {
                return true; // found → stop early
            }
        }

        return false; // not found
    }
}
