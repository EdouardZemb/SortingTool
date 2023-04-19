package sorting;

import java.util.List;

public interface DataStats<T> {
    int getCount();
    T getMax();
    int getMaxCount();
    List<T> getSortedData();
    double getMaxPercentage();
}