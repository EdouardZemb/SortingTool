package sorting;

// Enum representing the possible data types
enum DataType {
    LONG, LINE, WORD;

    public static DataType fromString(String str) {
        return switch (str) {
            case "long" -> LONG;
            case "line" -> LINE;
            case "word" -> WORD;
            default -> throw new IllegalArgumentException("Invalid data type: " + str);
        };
    }
}