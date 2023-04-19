package sorting;

import java.util.List;

public interface DataAnalyzer<T> {
    DataStats<T> analyze(List<T> data);
}
