package sorting;

import java.util.List;
import java.util.Map;

public class LongOutputFormatter implements OutputFormatter, NaturalSorterOutputFormatter<NaturalSorter<Long>>, ByCountSorterOutputFormatter<ByCountSorter<Long>> {
    @Override
    public String format(Sorter sorter) {
        if (sorter instanceof NaturalSorter<?>)
            return formatNatural((NaturalSorter<Long>) sorter);
        else if (sorter instanceof ByCountSorter<?>)
            return formatByCount((ByCountSorter<Long>) sorter);
        else
            throw new IllegalArgumentException("Unknown sorter type");
    }

    @Override
    public String formatNatural(NaturalSorter<Long> sorter) {
        List<?> sortedData = sorter.getData();
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Total numbers: %d.%n", sortedData.size()));
        sb.append("Sorted data:");

        for (Object obj : sortedData) {
            sb.append(" ").append(obj);
        }

        sb.append("\n");
        return sb.toString();
    }

    @Override
    public String formatByCount(ByCountSorter<Long> sorter) {
        StringBuilder sb = new StringBuilder();
        sb.append("Total numbers: ").append(sorter.getDataCount()).append(".\n");
        for (Map.Entry<Long, Integer> entry : sorter.getSortedData().entrySet()) {
            sb.append(entry.getKey()).append(": ").append(entry.getValue()).append(" time(s), ").append(sorter.getPercentage(entry.getKey())).append("%").append("\n");
        }
        return sb.toString();
    }
}
