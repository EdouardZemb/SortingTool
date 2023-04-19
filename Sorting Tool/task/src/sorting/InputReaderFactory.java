package sorting;

public class InputReaderFactory {
    public static InputReader create(InputType inputType) {
        return switch (inputType) {
            case LONG -> new LongInputReader();
            case LINE -> new LineInputReader();
            default -> new WordInputReader();
        };
    }
}