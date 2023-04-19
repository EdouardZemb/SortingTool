package sorting;

public class LineOutputFormatter implements OutputFormatter<String> {
    @Override
    public String format(DataStats stats) {
        return String.format("Total lines: %d.%n" +
                        "The longest line:%n%s%n(%d time(s), %f%%).%n",
                stats.getCount(), stats.getMax(), stats.getMaxCount(), stats.getMaxPercentage());
    }
}
