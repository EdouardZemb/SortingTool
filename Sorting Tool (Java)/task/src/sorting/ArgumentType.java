package sorting;


public enum ArgumentType {
    DATA_TYPE("-dataType"),
    SORT_TYPE("-sortingType");

    private final String value;

    ArgumentType(String value) {
        this.value = value;
    }

    public boolean equals(String value) {
        return this.value.equals(value);
    }
}
