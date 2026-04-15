package UC7;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TrainService {

    public static void sortBogiesByCapacity(List<Bogie> bogies) {
        Collections.sort(bogies, Comparator.comparingInt(Bogie::getCapacity));
    }
}