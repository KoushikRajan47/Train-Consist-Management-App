package UC9;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TrainService {

    public static Map<String, List<Bogie>> groupBogiesByType(List<Bogie> bogies) {

        return bogies.stream()
                .collect(Collectors.groupingBy(Bogie::getName));
    }
}