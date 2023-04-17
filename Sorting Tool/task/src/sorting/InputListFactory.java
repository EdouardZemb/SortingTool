package sorting;

public class InputListFactory {
    public static InputList createInputList(DataType dataType) {
        InputList inputList;
        switch (dataType) {
            case LONG -> {
                inputList = new LongInputList();
                inputList.setInputReader(new LongInputReader());
            }
            case LINE -> {
                inputList = new LineInputList();
                inputList.setInputReader(new LineInputReader());
            }
            case WORD -> {
                inputList = new WordInputList();
                inputList.setInputReader(new WordInputReader());
            }
            default -> throw new IllegalArgumentException("Invalid data type");
        }
        return inputList;
    }
}
