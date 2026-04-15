package UC9;

import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase9TrainConsistMgmtTest {

    private List<Bogie> getSampleBogies() {
        return Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 56),
                new Bogie("First Class", 24),
                new Bogie("Sleeper", 70),
                new Bogie("AC Chair", 60)
        );
    }

    @Test
    void testGrouping_BogiesGroupedByType() {
        Map<String, List<Bogie>> result =
                TrainService.groupBogiesByType(getSampleBogies());

        assertTrue(result.containsKey("Sleeper"));
        assertTrue(result.containsKey("AC Chair"));
    }

    @Test
    void testGrouping_MultipleBogiesInSameGroup() {
        Map<String, List<Bogie>> result =
                TrainService.groupBogiesByType(getSampleBogies());

        assertTrue(result.get("Sleeper").size() > 1);
    }

    @Test
    void testGrouping_DifferentBogieTypes() {
        Map<String, List<Bogie>> result =
                TrainService.groupBogiesByType(getSampleBogies());

        assertEquals(3, result.keySet().size());
    }

    @Test
    void testGrouping_EmptyBogieList() {
        Map<String, List<Bogie>> result =
                TrainService.groupBogiesByType(new ArrayList<>());

        assertTrue(result.isEmpty());
    }

    @Test
    void testGrouping_SingleBogieCategory() {
        List<Bogie> list = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("Sleeper", 70)
        );

        Map<String, List<Bogie>> result =
                TrainService.groupBogiesByType(list);

        assertEquals(1, result.keySet().size());
    }

    @Test
    void testGrouping_MapContainsCorrectKeys() {
        Map<String, List<Bogie>> result =
                TrainService.groupBogiesByType(getSampleBogies());

        assertTrue(result.containsKey("First Class"));
    }

    @Test
    void testGrouping_GroupSizeValidation() {
        Map<String, List<Bogie>> result =
                TrainService.groupBogiesByType(getSampleBogies());

        assertEquals(2, result.get("Sleeper").size());
    }

    @Test
    void testGrouping_OriginalListUnchanged() {
        List<Bogie> original = new ArrayList<>(getSampleBogies());

        TrainService.groupBogiesByType(original);

        assertEquals(5, original.size());
    }
}