package sorting;

import java.util.List;

public class NaturalSorter<T extends Comparable<T>> extends Sorter<T, List<T>> {
    public List<T> sortNatural(List<T> data) {
        for (int i = 0; i < data.size(); i++) {
            for (int j = 0; j < data.size() - 1; j++) {
                if (data.get(j).compareTo(data.get(j + 1)) > 0) {
                    T temp = data.get(j);
                    data.set(j, data.get(j + 1));
                    data.set(j + 1, temp);
                }
            }
        }
        return data;
    }

    @Override
    void sort() {
        assert data != null;
        sortedData = sortNatural(data);
    }
}
