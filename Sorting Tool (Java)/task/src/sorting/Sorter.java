package sorting;

import java.util.List;

public abstract class Sorter<T, U> {
    protected List<T> data;
    protected U sortedData;

    public void setData(List<T> data) {
        this.data = data;
    }

    public List<T> getData() {
        return data;
    }

    public U getSortedData() {
        return sortedData;
    }
    abstract void sort();

    public int getCount() {
        return data.size();
    }

    public int getDataCount() {
        return data.size();
    }
}
