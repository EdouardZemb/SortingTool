package sorting;

import java.util.Scanner;

public class LongInputList extends InputList<Long> {
    public LongInputList() {
        super(DataType.LONG);
    }

    @Override
    public Long findNextFrom(Scanner scanner) {
        return scanner.nextLong();
    }

    @Override
    public boolean hasNextIn(Scanner scanner) {
        return scanner.hasNextLong();
    }
}
