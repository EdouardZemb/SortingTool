package sorting;

public class WordOutputFormatter implements OutputFormatter<String> {
    @Override
    public String format(DataStats<String> stats) {
        return String.format("Total words: %d.%n" +
                        "The longest word: %s (%d time(s), %d%%).%n",
                stats.getCount(), stats.getMax(), stats.getMaxCount(), (int) stats.getMaxPercentage());
    }
}
