package sorting;

import java.util.Objects;


public class DataSorterFactory {

    public static DataSorter<?> create(InputType inputType, SortingType sortingType) {
        Objects.requireNonNull(inputType);
        Objects.requireNonNull(sortingType);
        if (inputType == InputType.LONG) {
            return new LongDataSorter(sortingType);
        }
        return null;
    }
}
