package sorting;


public enum ArgumentType {
    DATA_TYPE("-dataType"),
    SORT_INTEGER("-sortIntegers");

    private final String value;

    ArgumentType(String value) {
        this.value = value;
    }

    public static ArgumentType fromValue(String value) {
        for (ArgumentType argumentType : values()) {
            if (argumentType.value.equals(value)) {
                return argumentType;
            }
        }
        throw new IllegalArgumentException("Invalid argument type: " + value);
    }

    public String getValue() {
        return value;
    }
}
