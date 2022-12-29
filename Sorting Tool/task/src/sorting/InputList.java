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
        return "Total " + dataType.name().toLowerCase() + ": " +
                inputList.size() +
                ".\nThe " +
                (dataType == DataType.LONG ? "greatest " : "longest ") +
                dataType.name().toLowerCase() +
                " :" +
                (dataType == DataType.LINE ? "\n" : " ") +
                maxValue() +
                (dataType == DataType.LINE ? "\n" : " ") +
                "(" +
                getFrequency() +
                " times(s), " +
                (int) (((double) getFrequency() / (double) inputList.size()) * 100D) +
                "%).";
    }

    private int getFrequency() {
        return Collections.frequency(inputList, maxValue());
    }


}
