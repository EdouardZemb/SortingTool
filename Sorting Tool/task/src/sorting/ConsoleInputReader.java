package sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleInputReader implements InputReader {
    @Override
    public List<Integer> readNumbers() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            numbers.add(num);
        }

        return numbers;
    }
}
