package sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LongInputReader implements InputReader<Long> {
    @Override
    public List<Long> read() {
        Scanner scanner = new Scanner(System.in);
        List<Long> input = new ArrayList<>();

        while (scanner.hasNext()) {
            if (!scanner.hasNextLong()) {
                System.out.println("\"" + scanner.next() + "\" isn't a long. It's skipped.");
                scanner.next();
                continue;
            }
            long num = scanner.nextLong();
            input.add(num);
        }

        return input;
    }

    @Override
    public InputType getInputType() {
        return InputType.LONG;
    }
}
