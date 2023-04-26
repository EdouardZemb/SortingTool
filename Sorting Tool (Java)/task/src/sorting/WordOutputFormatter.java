package sorting;

import java.util.Map;

public class WordOutputFormatter implements OutputFormatter, NaturalSorterOutputFormatter<NaturalSorter<String>>, ByCountSorterOutputFormatter<ByCountSorter<String>> {
    @Override
    public String format(Sorter sorter) {
        if (sorter instanceof ByCountSorter<?>)
            return formatByCount((ByCountSorter<String>) sorter);
        else if (sorter instanceof NaturalSorter<?>)
            return formatNatural((NaturalSorter<String>) sorter);
        else
            throw new IllegalArgumentException("Unknown sorter type");
    }


    @Override
    public String formatNatural(NaturalSorter<String> sorter) {
        StringBuilder sb = new StringBuilder();
        sb.append("Total words: ").append(sorter.getCount()).append(".\n");
        sb.append("Sorted data:");
        for (String word : sorter.getSortedData()) {
            sb.append(" ").append(word);
        }
        sb.append(".\n");
        return sb.toString();
    }

    @Override
    public String formatByCount(ByCountSorter<String> sorter) {
        StringBuilder sb = new StringBuilder();
        sb.append("Total words: ").append(sorter.getCount()).append(".\n");
        for (Map.Entry<String, Integer> entry : sorter.getSortedData().entrySet()) {
            sb.append(entry.getKey()).append(": ").append(entry.getValue()).append(" time(s), ").append(sorter.getPercentage(entry.getKey())).append("%").append("\n");
        }
        return sb.toString();
    }
}
