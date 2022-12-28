package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class InputList<T extends Comparable<T>> {

    List<T> inputList = new ArrayList<>();

    final DataType dataType;

    protected InputList(DataType dataType) {
        this.dataType = dataType;
    }

    T maxValue() {
        return Collections.max(inputList);
    }

    abstract void read();

    @Override
    public String toString() {

        return "Total numbers: " +
                inputList.size() +
                ".\nThe " +
                (dataType == DataType.LONG ? "greatest " : "longest ") +
                dataType.name().toLowerCase() +
                " : " +
                maxValue() +
                " (" +
                Collections.frequency(inputList, maxValue()) +
                " times(s)).";
    }
}
