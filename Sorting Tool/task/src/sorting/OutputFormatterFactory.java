package sorting;

public class OutputFormatterFactory {
    public static OutputFormatter<?> create(InputType dataType) {
        OutputFormatter<?> outputFormatter;
        switch (dataType) {
            case LONG -> outputFormatter = new LongOutputFormatter();
            case LINE -> outputFormatter = new LineOutputFormatter();
            case WORD -> outputFormatter = new WordOutputFormatter();
            default -> throw new IllegalArgumentException("Unknown data type: " + dataType);
        }
        return outputFormatter;
    }
}
