package sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LongInputReader implements InputReader<Long> {
    @Override
    public List<Long> readInput() {
        Scanner scanner = new Scanner(System.in);
        List<Long> input = new ArrayList<>();

        while (scanner.hasNextLong()) {
            long num = scanner.nextLong();
            input.add(num);
        }

        return input;
    }
}
