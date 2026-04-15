package UC13;

import java.util.ArrayList;
import java.util.List;

public class UseCase13TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC13 - Performance Comparison (Loops vs Streams)");
        System.out.println("====================================");

        // Step 1: Create large dataset
        List<Bogie> bogies = new ArrayList<>();

        for (int i = 0; i < 100000; i++) {
            bogies.add(new Bogie("Type" + i, (i % 100) + 1));
        }

        // Step 2: Loop timing
        long startLoop = System.nanoTime();
        List<Bogie> loopResult = PerformanceService.filterWithLoop(bogies);
        long endLoop = System.nanoTime();

        long loopTime = endLoop - startLoop;

        // Step 3: Stream timing
        long startStream = System.nanoTime();
        List<Bogie> streamResult = PerformanceService.filterWithStream(bogies);
        long endStream = System.nanoTime();

        long streamTime = endStream - startStream;

        // Step 4: Output results
        System.out.println("\nLoop Result Size: " + loopResult.size());
        System.out.println("Stream Result Size: " + streamResult.size());

        System.out.println("\nLoop Execution Time: " + loopTime + " ns");
        System.out.println("Stream Execution Time: " + streamTime + " ns");
    }
}