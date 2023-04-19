package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LongInputReader implements InputReader {
    @Override
    public List<String> readInput() {
        Scanner scanner = new Scanner(System.in);
        List<String> input = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] nums = line.split("\\s+");
            input.addAll(Arrays.asList(nums));
        }

        return input;
    }
}
