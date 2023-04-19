package sorting;

import java.util.*;

public class Main {
    public static void main(final String[] args) {
        // parse command-line arguments
        CommandLineArgumentsParser commandLineArgumentsParser = new CommandLineArgumentsParser(args);
        InputType inputType = commandLineArgumentsParser.parseInputType();

        // read input data
        assert inputType != null;
        InputReader inputReader = InputReaderFactory.create(inputType);
        List<String> inputData = inputReader.readInput();

        // analyze input data
        DataAnalyzer dataAnalyzer = DataAnalyzerFactory.create(inputType);
        DataStats dataStats = dataAnalyzer.analyze(inputData);

        // format and output analysis results
        OutputFormatter<?> outputFormatter = OutputFormatterFactory.create(inputType);
        String output = outputFormatter.format(dataStats);

        System.out.println(output);
    }
}