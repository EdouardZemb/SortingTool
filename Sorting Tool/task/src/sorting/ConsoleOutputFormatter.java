package sorting;

public class ConsoleOutputFormatter implements OutputFormatter {
    @Override
    public String format(NumberStats stats) {
        return String.format("Total numbers: %d.%nThe greatest number: %d (%d time(s)).%n",
                stats.count(), stats.max(), stats.maxCount());
    }
}
