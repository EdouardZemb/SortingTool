package sorting;

public class InputListFactory {
    public static InputList createInputList(DataType dataType) {
        return switch (dataType) {
            case LONG -> new LongInputList();
            case LINE -> new LineInputList();
            case WORD -> new WordInputList();
            default -> throw new IllegalArgumentException("Unsupported data type: " + dataType);
        };
    }
}
