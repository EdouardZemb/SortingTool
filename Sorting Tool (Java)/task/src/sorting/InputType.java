package sorting;

public enum InputType {
    LONG("long"),
    LINE("line"),
    WORD("word");

    private final String value;

    InputType(String value) {
        this.value = value;
    }

    public static InputType fromValue(String value) {
        for (InputType inputType : values()) {
            if (inputType.value.equals(value)) {
                return inputType;
            }
        }
        return WORD;
    }
}