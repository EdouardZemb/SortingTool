package sorting;

public class ResultPrinter<T extends Comparable<T>> {
    public void printResults(DataType dataType, InputList<T> inputList) {
        System.out.println("Total " + dataType.name().toLowerCase() + ": " + inputList.size() + ".");
        String longest = dataType == DataType.LINE ? "longest" : "greatest";
        System.out.println("The " + longest + " " + dataType.name().toLowerCase() + " :"
                + (dataType == DataType.LINE ? "\n" : " ")
                + inputList.maxValue()
                + (dataType == DataType.LINE ? "\n" : " ")
                + "(" + inputList.getFrequency() + " time(s), "
                + (int) (((double) inputList.getFrequency() / (double) inputList.size()) * 100D) + "%).");
    }
}
