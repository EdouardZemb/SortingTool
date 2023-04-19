package sorting;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordAnalyzer implements DataAnalyzer<String> {

    @Override
    public DataStats<String> analyze(List<String> data) {
        int count = 0;
        Map<String, Integer> wordCounts = new HashMap<>();
        int maxCount = 0;
        String maxWord = "";
        for (String line : data) {
            String[] words = line.split("\\s+");
            for (String word : words) {
                count++;
                int currentCount = wordCounts.getOrDefault(word, 0) + 1;
                wordCounts.put(word, currentCount);
                if (word.length() > maxWord.length()) {
                    maxWord = word;
                }
            }
            maxCount = wordCounts.getOrDefault(maxWord, 0);
        }
        List<String> sortedData = wordCounts.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        int maxPercentage = count == 0 ? 0 : maxCount * 100 / count;

        return new DataStatsImpl<>(count, maxWord, maxCount, sortedData, maxPercentage);
    }
}
