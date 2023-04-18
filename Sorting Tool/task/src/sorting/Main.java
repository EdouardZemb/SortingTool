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

        InputList inputList = InputListFactory.createInputList(dataType);
        inputList.read();

        ResultPrinter resultPrinter = new ResultPrinter();
        resultPrinter.printResults(dataType, inputList);
    }
}