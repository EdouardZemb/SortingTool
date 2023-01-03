package sorting;


public class Main {
    public static void main(String[] args) {
        // Set the default data type to word
        DataType dataType = DataType.WORD;

        // Check if the -dataTypeValue argument was provided and set the data type accordingly
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("-dataTypeValue")) {
                dataType = DataType.fromString(args[i + 1]);
                break;
            }
        }

        // Read the input based on the data type
        InputList inputList = switch (dataType) {
            case LONG -> new LongInputList();
            case LINE -> new LineInputList();
            case WORD -> new WordInputList();
        };
        inputList.read();

        // Compute and print the requested information
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