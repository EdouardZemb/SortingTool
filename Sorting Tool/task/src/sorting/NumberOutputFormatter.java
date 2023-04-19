package sorting;

public class NumberOutputFormatter implements OutputFormatter<Long> {
    @Override
    public String format(DataStats stats) {
        return String.format("Total numbers: %d.%nThe greatest number: %d (%d time(s), %f%%).%n",
                stats.getCount(), stats.getMax(), stats.getMaxCount(), stats.getMaxPercentage());
    }
}
