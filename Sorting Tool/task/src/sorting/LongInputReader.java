package sorting;

import java.util.Scanner;

public class LongInputReader implements InputReader<Long> {
    @Override
    public void readInput(InputList<Long> inputList) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLong()) {
            long number = scanner.nextLong();
            inputList.add(number);
        }
    }
}
