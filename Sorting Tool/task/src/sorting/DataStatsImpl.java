package sorting;

import java.util.List;

public class DataStatsImpl<T> implements DataStats<T> {

    private final int count;
    private final T max;
    private final int maxCount;
    private final List<T> sortedData;
    private final double maxPercentage;

    public DataStatsImpl(int count, T max, int maxCount, List<T> sortedData, double maxPercentage) {
        this.count = count;
        this.max = max;
        this.maxCount = maxCount;
        this.sortedData = sortedData;
        this.maxPercentage = maxPercentage;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public T getMax() {
        return max.equals("") ? null : max;
    }

    @Override
    public int getMaxCount() {
        return maxCount;
    }

    @Override
    public List<T> getSortedData() {
        return sortedData;
    }

    @Override
    public double getMaxPercentage() {
        return maxPercentage;
    }
}
