package sorting;

import java.util.*;

public class LineAnalyzer implements DataAnalyzer<String> {

    @Override
    public DataStats<String> analyze(List<String> data) {
        int count = data.size();
        Map<String, Integer> lineCounts = new HashMap<>();
        int maxLineLength = 0;
        String maxLine = "";
        int maxCount = 0;
        for (String line : data) {
            int lineLength = line.length();
            int currentCount = lineCounts.getOrDefault(line, 0) + 1;
            lineCounts.put(line, currentCount);
            if (lineLength > maxLineLength) {
                maxLineLength = lineLength;
                maxLine = line;
            }
            maxCount = lineCounts.getOrDefault(maxLine, 0);
        }

        int maxPercentage = count == 0 ? 0 : maxCount * 100 / count;

        List<String> sortedData = new ArrayList<>(data);
        Collections.sort(sortedData);

        return new DataStatsImpl<>(count, maxLine, maxCount, sortedData, maxPercentage);
    }

}
