package UC7;

import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase7TrainConsistMgmtTest {

    private List<Bogie> getSampleBogies() {
        return new ArrayList<>(Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 56),
                new Bogie("First Class", 48),
                new Bogie("General", 90)
        ));
    }

    @Test
    void testSortingAscendingOrder() {
        List<Bogie> bogies = getSampleBogies();
        TrainService.sortBogiesByCapacity(bogies);

        for (int i = 0; i < bogies.size() - 1; i++) {
            assertTrue(bogies.get(i).getCapacity() <= bogies.get(i + 1).getCapacity());
        }
    }

    @Test
    void testSortingWithSingleElement() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));

        TrainService.sortBogiesByCapacity(bogies);

        assertEquals(1, bogies.size());
    }

    @Test
    void testSortingEmptyList() {
        List<Bogie> bogies = new ArrayList<>();

        TrainService.sortBogiesByCapacity(bogies);

        assertTrue(bogies.isEmpty());
    }

    @Test
    void testSortingMaintainsAllElements() {
        List<Bogie> bogies = getSampleBogies();
        TrainService.sortBogiesByCapacity(bogies);

        assertEquals(4, bogies.size());
    }
}