package sorting;

import java.util.Scanner;

// Concrete class representing a list of long values
public class LongInputList extends InputList<Long> {
    public LongInputList() {
        super(DataType.LONG);
    }

    @Override
    public void read() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLong()) {
            long number = scanner.nextLong();
            inputList.add(number);
        }
    }
}
