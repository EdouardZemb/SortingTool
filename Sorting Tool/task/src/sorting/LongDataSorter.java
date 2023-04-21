package sorting;

import java.util.ArrayList;
import java.util.List;

public class LongDataSorter implements DataSorter<Long> {

    private final SortingType sortingType;
    public LongDataSorter(SortingType sortingType) {
        this.sortingType = sortingType;
    }

    @Override
    public List<Long> sort(List<Long> inputData) {
        if (sortingType != SortingType.ASCENDING) {
            throw new UnsupportedOperationException("Only ascending sorting is supported.");
        }

        return mergeSort(inputData);
    }

    /**
     * Sorts the input data using the merge sort algorithm
     * @param list  the list to sort
     * @return  the sorted list
     */
    private List<Long> mergeSort(List<Long> list) {
        if (list.size() <= 1) {
            return list;
        }

        int middle = list.size() / 2;
        List<Long> left = new ArrayList<>(list.subList(0, middle));
        List<Long> right = new ArrayList<>(list.subList(middle, list.size()));

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }

    /**
     * Merges two sorted lists into one sorted list
     * @param left  the left list
     * @param right  the right list
     * @return  the merged list
     */
    private List<Long> merge(List<Long> left, List<Long> right) {
        List<Long> result = new ArrayList<>();

        int leftIndex = 0;
        int rightIndex = 0;

        while (leftIndex < left.size() && rightIndex < right.size()) {
            if (left.get(leftIndex) <= right.get(rightIndex)) {
                result.add(left.get(leftIndex));
                leftIndex++;
            } else {
                result.add(right.get(rightIndex));
                rightIndex++;
            }
        }

        result.addAll(left.subList(leftIndex, left.size()));
        result.addAll(right.subList(rightIndex, right.size()));

        return result;
    }


}
