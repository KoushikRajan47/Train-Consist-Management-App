package UC13;

import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase13TrainConsistMgmtTest {

    private List<Bogie> getSampleBogies() {
        return Arrays.asList(
                new Bogie("A", 50),
                new Bogie("B", 70),
                new Bogie("C", 80),
                new Bogie("D", 40)
        );
    }

    @Test
    void testLoopFilteringLogic() {
        List<Bogie> result = PerformanceService.filterWithLoop(getSampleBogies());

        assertTrue(result.stream().allMatch(b -> b.getCapacity() > 60));
    }

    @Test
    void testStreamFilteringLogic() {
        List<Bogie> result = PerformanceService.filterWithStream(getSampleBogies());

        assertTrue(result.stream().allMatch(b -> b.getCapacity() > 60));
    }

    @Test
    void testLoopAndStreamResultsMatch() {
        List<Bogie> loopResult = PerformanceService.filterWithLoop(getSampleBogies());
        List<Bogie> streamResult = PerformanceService.filterWithStream(getSampleBogies());

        assertEquals(loopResult.size(), streamResult.size());
    }

    @Test
    void testExecutionTimeMeasurement() {
        List<Bogie> bogies = getSampleBogies();

        long start = System.nanoTime();
        PerformanceService.filterWithLoop(bogies);
        long end = System.nanoTime();

        assertTrue((end - start) > 0);
    }

    @Test
    void testLargeDatasetProcessing() {
        List<Bogie> bogies = new ArrayList<>();

        for (int i = 0; i < 10000; i++) {
            bogies.add(new Bogie("T" + i, (i % 100) + 1));
        }

        List<Bogie> result = PerformanceService.filterWithStream(bogies);

        assertNotNull(result);
    }
}