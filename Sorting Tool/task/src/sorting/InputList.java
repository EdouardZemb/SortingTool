package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Abstract class representing a list of values that can be read from a Scanner
abstract class InputList<T extends Comparable<T>> implements ScannerReadable<T> {
    protected final DataType dataType;
    protected final List<T> inputList = new ArrayList<>();

    public InputList(DataType dataType) {
        this.dataType = dataType;
    }

    public T maxValue() {
        return Collections.max(inputList);
    }

    public int size() {
        return inputList.size();
    }

    public int getFrequency() {
        return Collections.frequency(inputList, maxValue());
    }
}
