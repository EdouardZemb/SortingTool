package sorting;

import java.util.*;

public class Main {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        LongInputList longInputList = new LongInputList();
        while (scanner.hasNextLong()) {
            long number = scanner.nextLong();
            longInputList.add(new LongInput(number));
        }
        System.out.println(
                "Total numbers: " + longInputList.getSize() + ".\n" +
                "The greatest number: " + longInputList.getMaxValue() +
                        " (" + longInputList.getMaxValueFrequency() +
                        " time(s)).");
    }
}
