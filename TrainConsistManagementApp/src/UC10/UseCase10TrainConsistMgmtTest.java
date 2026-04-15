package UC10;

import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase10TrainConsistMgmtTest {

    private List<Bogie> getSampleBogies() {
        return Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 56),
                new Bogie("First Class", 24),
                new Bogie("Sleeper", 70)
        );
    }

    @Test
    void testReduce_TotalSeatCalculation() {
        int total = TrainService.calculateTotalSeats(getSampleBogies());
        assertEquals(222, total); // 72+56+24+70
    }

    @Test
    void testReduce_MultipleBogiesAggregation() {
        int total = TrainService.calculateTotalSeats(getSampleBogies());
        assertTrue(total > 0);
    }

    @Test
    void testReduce_SingleBogieCapacity() {
        List<Bogie> list = Arrays.asList(new Bogie("Sleeper", 72));
        int total = TrainService.calculateTotalSeats(list);
        assertEquals(72, total);
    }

    @Test
    void testReduce_EmptyBogieList() {
        int total = TrainService.calculateTotalSeats(new ArrayList<>());
        assertEquals(0, total);
    }

    @Test
    void testReduce_CorrectCapacityExtraction() {
        int total = TrainService.calculateTotalSeats(getSampleBogies());
        assertEquals(222, total);
    }

    @Test
    void testReduce_AllBogiesIncluded() {
        int total = TrainService.calculateTotalSeats(getSampleBogies());
        assertEquals(222, total);
    }

    @Test
    void testReduce_OriginalListUnchanged() {
        List<Bogie> original = new ArrayList<>(getSampleBogies());
        TrainService.calculateTotalSeats(original);

        assertEquals(4, original.size());
    }
}