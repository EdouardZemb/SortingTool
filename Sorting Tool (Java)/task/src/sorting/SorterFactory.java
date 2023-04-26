package sorting;

import java.util.Objects;


public class SorterFactory {
    public static Sorter create(SortingType sortingType) {
        Objects.requireNonNull(sortingType);
        Sorter dataSorter = null;
            switch (sortingType) {
                case NATURAL -> dataSorter = new NaturalSorter();
                case BY_COUNT -> dataSorter = new ByCountSorter();
            }
        return dataSorter;
    }
}
