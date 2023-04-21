package sorting;

import java.util.List;

/**
 * Represents an argument
 */
public class InputTypeArgument implements Argument {
    private final String arg;

    public InputTypeArgument(String arg) {
        this.arg = arg;
    }


    @Override
    public void execute() {
        // read input data
        InputType inputType = InputType.fromValue(arg);
        InputReader<?> inputReader = InputReaderFactory.create(inputType);
        List<?> inputData = inputReader.readInput();

        // analyze input data
        DataAnalyzer dataAnalyzer = DataAnalyzerFactory.create(inputType);
        DataStats dataStats = dataAnalyzer.analyze(inputData);

        // format and output analysis results
        OutputFormatter<?> outputFormatter = OutputFormatterFactory.create(inputType);
        String output = outputFormatter.format(dataStats);

        System.out.println(output);
    }
}
