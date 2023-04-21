package sorting;

import java.util.List;

public interface OutputFormatter<T> {
    String format(DataStats<T> stats);

    default String format(List<?> sortedData) {
        return sortedData.toString();
    }
}
