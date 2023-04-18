package sorting;

import java.util.List;

public class NumberAnalyzer {
    public NumberStats analyze(List<Integer> numbers) {
        int count = 0;
        int max = Integer.MIN_VALUE;
        int maxCount = 0;

        for (int num : numbers) {
            count++;

            if (num > max) {
                max = num;
                maxCount = 1;
            } else if (num == max) {
                maxCount++;
            }
        }

        return new NumberStatsImpl(count, max, maxCount);
    }

    private record NumberStatsImpl(int count, int max, int maxCount) implements NumberStats {
    }
}
