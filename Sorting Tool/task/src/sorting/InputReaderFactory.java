package sorting;

public class InputReaderFactory {
    public static InputReader create(InputType inputType) {
        if (inputType == null) {
            throw new IllegalArgumentException("Data type cannot be null");
        }

        return switch (inputType) {
            case LONG -> new LongInputReader();
            case LINE -> new LineInputReader();
            default -> new WordInputReader();
        };
    }
}