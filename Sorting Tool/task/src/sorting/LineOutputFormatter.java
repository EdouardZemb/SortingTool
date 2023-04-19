package sorting;

public class LineOutputFormatter implements OutputFormatter<String> {
    @Override
    public String format(DataStats<String> stats) {
        String longestLine = stats.getMax() != null ? stats.getMax() : "No data to display";
        return String.format("Total lines: %d.%n" +
                        "The longest line:%n%s%n(%d time(s), %f%%).%n",
                stats.getCount(), longestLine, stats.getMaxCount(), stats.getMaxPercentage());
    }
}
