package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LongAnalyzer implements DataAnalyzer<Long> {

    @Override
    public DataStats<Long> analyze(List<Long> data) {
        int count = data.size();
        long sum = 0;
        long maxNumber = Long.MIN_VALUE;
        long minNumber = Long.MAX_VALUE;
        int maxCount = 0;
        for (Object value : data) {
            if (value instanceof Long) {
                long number = (Long) value;
                sum += number;
                if (number > maxNumber) {
                    maxNumber = number;
                    maxCount = 1;
                } else if (number == maxNumber) {
                    maxCount++;
                }
                if (number < minNumber) {
                    minNumber = number;
                }
            } else if (value instanceof String) {
                try {
                    long number = Long.parseLong((String) value);
                    sum += number;
                    if (number > maxNumber) {
                        maxNumber = number;
                        maxCount = 1;
                    } else if (number == maxNumber) {
                        maxCount++;
                    }
                    if (number < minNumber) {
                        minNumber = number;
                    }
                } catch (NumberFormatException e) {
                    // Handle invalid input value
                }
            }
        }
        long average = sum / count;

        List<Long> sortedData = new ArrayList<>(data);
        Collections.sort(sortedData);

        return new DataStatsImpl<>(count, maxNumber, maxCount, sortedData, average);
    }
}
