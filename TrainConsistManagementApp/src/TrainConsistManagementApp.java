import java.util.ArrayList;
import java.util.List;

public class HotelBookingApp {

    public static void main(String[] args) {

        List<String> bogies = new ArrayList<>();

        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("First Class");

        System.out.println("After adding bogies:");
        System.out.println(bogies);

        bogies.remove("AC Chair");

        System.out.println("\nAfter removing AC Chair:");
        System.out.println(bogies);

        boolean exists = bogies.contains("Sleeper");
        System.out.println("\nDoes Sleeper exist? " + exists);

        System.out.println("\nFinal bogie list:");
        System.out.println(bogies);
    }
}