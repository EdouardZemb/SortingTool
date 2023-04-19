package sorting;

public class DataAnalyzerFactory {

    public static DataAnalyzer<?> create(InputType dataType) {
        if (dataType == null) {
            throw new IllegalArgumentException("Data type cannot be null");
        }

        DataAnalyzer<?> dataAnalyzer;
        switch (dataType) {
            case WORD -> dataAnalyzer = new WordAnalyzer();
            case LINE -> dataAnalyzer = new LineAnalyzer();
            case LONG -> dataAnalyzer = new LongAnalyzer();
            default -> throw new IllegalArgumentException("Unknown data type: " + dataType);
        }
        return dataAnalyzer;
    }
}

