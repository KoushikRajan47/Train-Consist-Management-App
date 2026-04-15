package UC10;

import java.util.List;

public class TrainService {

    public static int calculateTotalSeats(List<Bogie> bogies) {

        return bogies.stream()
                .map(b -> b.getCapacity())   // extract capacity
                .reduce(0, Integer::sum);   // sum all values
    }
}