package sorting;

import java.util.Scanner;

public class LongInputList extends InputList<Long> {
    public LongInputList() {
        super(DataType.LONG);
    }

    @Override
    void read() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLong()) {
            long number = scanner.nextLong();
            inputList.add(number);
        }
    }
}
