package sorting;

import java.util.List;

public class SortingNumberArgument implements Argument {
    public SortingNumberArgument() { }

    @Override
    public void execute() {
        // read input data
        InputReader<?> inputReader = InputReaderFactory.create(InputType.LONG);
        List<?> inputData = inputReader.readInput();
        // sort the input data
        DataSorter dataSorter = DataSorterFactory.create(InputType.LONG, SortingType.ASCENDING);
        assert dataSorter != null;
        List<?> sortedData = dataSorter.sort(inputData);
        // format and output the sorted data
        OutputFormatter<?> outputFormatter = OutputFormatterFactory.create(InputType.LONG);
        String output = outputFormatter.format(sortedData);
        System.out.println(output);
    }
}
