package UC8;

import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistMgmtTest {

    private List<Bogie> getSampleBogies() {
        return Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 60),
                new Bogie("First Class", 70),
                new Bogie("General", 90)
        );
    }

    @Test
    void testFilter_CapacityGreaterThanThreshold() {
        List<Bogie> result = TrainService.filterBogies(getSampleBogies(), 70);
        assertTrue(result.stream().allMatch(b -> b.getCapacity() > 70));
    }

    @Test
    void testFilter_CapacityEqualToThreshold() {
        List<Bogie> result = TrainService.filterBogies(getSampleBogies(), 70);
        assertFalse(result.stream().anyMatch(b -> b.getCapacity() == 70));
    }

    @Test
    void testFilter_CapacityLessThanThreshold() {
        List<Bogie> result = TrainService.filterBogies(getSampleBogies(), 70);
        assertFalse(result.stream().anyMatch(b -> b.getCapacity() < 70));
    }

    @Test
    void testFilter_MultipleBogiesMatching() {
        List<Bogie> result = TrainService.filterBogies(getSampleBogies(), 60);
        assertTrue(result.size() > 1);
    }

    @Test
    void testFilter_NoBogiesMatching() {
        List<Bogie> result = TrainService.filterBogies(getSampleBogies(), 100);
        assertTrue(result.isEmpty());
    }

    @Test
    void testFilter_AllBogiesMatching() {
        List<Bogie> result = TrainService.filterBogies(getSampleBogies(), 40);
        assertEquals(getSampleBogies().size(), result.size());
    }

    @Test
    void testFilter_EmptyBogieList() {
        List<Bogie> result = TrainService.filterBogies(new ArrayList<>(), 50);
        assertTrue(result.isEmpty());
    }

    @Test
    void testFilter_OriginalListUnchanged() {
        List<Bogie> original = new ArrayList<>(getSampleBogies());
        TrainService.filterBogies(original, 70);

        assertEquals(4, original.size()); // original list unchanged
    }
}