package sorting;

public class LongOutputFormatter implements OutputFormatter<Long> {
    @Override
    public String format(DataStats<Long> stats) {
        return String.format("Total numbers: %d.%nThe greatest number: %d (%d time(s), %f%%).%n",
                stats.getCount(), stats.getMax(), stats.getMaxCount(), stats.getMaxPercentage());
    }
}
