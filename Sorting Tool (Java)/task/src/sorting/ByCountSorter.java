package sorting;

import java.util.*;

/**
 * This class sorts data entries by their count in ascending order, and then by key in ascending order.
 * @param <T> the type of data entries
 */
public class ByCountSorter<T extends Comparable<T>> extends Sorter<T, Map<T, Integer>>  {
    @Override
    void sort() {
        assert data != null;
        super.sortedData = sortCount(data);
    }
    public Map<T, Integer> sortCount(List<T> dataEntries) {
        Map<T, Integer> countMap = createCountMap(dataEntries);
        List<Map.Entry<T, Integer>> entryList = createEntryList(countMap);
        List<Map.Entry<T, Integer>> sortedEntryList = sortEntryList(entryList);
        return createSortedMap(sortedEntryList);
    }

    private Map<T, Integer> createCountMap(List<T> dataEntries) {
        Map<T, Integer> countMap = new HashMap<>();
        for (T entry : dataEntries) {
            countMap.put(entry, countMap.getOrDefault(entry, 0) + 1);
        }
        return countMap;
    }

    private List<Map.Entry<T, Integer>> createEntryList(Map<T, Integer> countMap) {
        return new ArrayList<>(countMap.entrySet());
    }

    private List<Map.Entry<T, Integer>> sortEntryList(List<Map.Entry<T, Integer>> entryList) {
        Comparator<Map.Entry<T, Integer>> countThenKeyComparator = Comparator
                .comparing(Map.Entry<T, Integer>::getValue)
                .thenComparing(Map.Entry::getKey);
        entryList.sort(countThenKeyComparator);
        return entryList;
    }

    private Map<T, Integer> createSortedMap(List<Map.Entry<T, Integer>> sortedEntryList) {
        Map<T, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<T, Integer> entry : sortedEntryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }

    public int getPercentage(T key) {
        return (int) (sortedData.get(key) * 100.0 / data.size());
    }
}
