import java.util.HashSet;
import java.util.Set;

public class HotelBookingApp {

    public static void main(String[] args) {

        Set<String> bogieIds = new HashSet<>();

        bogieIds.add("B1");
        bogieIds.add("B2");
        bogieIds.add("B3");
        bogieIds.add("B2");
        bogieIds.add("B1");

        System.out.println("Unique Bogie IDs:");
        System.out.println(bogieIds);
    }
}