package sorting;

import java.util.List;

public class LongOutputFormatter implements OutputFormatter<Long> {
    @Override
    public String format(DataStats<Long> stats) {
        return String.format("Total numbers: %d.%nThe greatest number: %d (%d time(s), %f%%).%n",
                stats.getCount(), stats.getMax(), stats.getMaxCount(), stats.getMaxPercentage());
    }

    @Override
    public String format(List<?> sortedData) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Total numbers: %d.%n", sortedData.size()));
        sb.append("Sorted data:");

        for (Object obj : sortedData) {
            sb.append(" ").append(obj);
        }

        sb.append("\n");
        return sb.toString();
    }
}
