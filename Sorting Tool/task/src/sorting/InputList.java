package sorting;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public abstract class InputList<T extends Comparable<T>> implements ScannerReadable<T> {
    List<T> inputList = new ArrayList<>();

    final DataType DATA_TYPE;

    protected InputList(DataType dataType) {
        this.DATA_TYPE = dataType;
    }

    T maxValue() {
        return Collections.max(inputList);
    }

    public void read() {
        Scanner scanner = new Scanner(System.in);
        while (hasNextIn(scanner)) {
            T element = findNextFrom(scanner);
            inputList.add(element);
        }
    }

    @Override
    public String toString() {
        String dataTypeName = DATA_TYPE.name().toLowerCase();
        boolean dataTypeIsLine = DATA_TYPE == DataType.LINE;

        return "Total " + dataTypeName + ": " +
                inputList.size() +
                ".\nThe " +
                getNextString(DATA_TYPE == DataType.LONG, "greatest ", "longest ") +
                dataTypeName +
                " :" +
                getNewLineOrSpace(dataTypeIsLine) +
                maxValue() +
                getNewLineOrSpace(dataTypeIsLine) +
                "(" +
                getFrequency() +
                " times(s), " +
                (int) (((double) getFrequency() / (double) inputList.size()) * 100D) +
                "%).";
    }

    @NotNull
    private static String getNewLineOrSpace(boolean dataTypeIsLine) {
        return getNextString(dataTypeIsLine, "\n", " ");
    }

    private static String getNextString(boolean dataTypeIsLine, String x, String x1) {
        return dataTypeIsLine ? x : x1;
    }

    private int getFrequency() {
        return Collections.frequency(inputList, maxValue());
    }


}
