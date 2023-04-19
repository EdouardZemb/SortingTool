package sorting;

public class OutputFormatterFactory {
    public static <T> OutputFormatter<?> create(InputType dataType) {
        OutputFormatter<?> outputFormatter;
        switch (dataType) {
            case LONG -> outputFormatter = new NumberOutputFormatter();
            case LINE -> outputFormatter = new LineOutputFormatter();
            case WORD -> outputFormatter = new WordOutputFormatter();
            default -> throw new IllegalArgumentException("Unknown data type: " + dataType);
        }
        return outputFormatter;
    }
}
