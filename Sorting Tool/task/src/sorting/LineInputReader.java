package sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LineInputReader implements InputReader {
    @Override
    public List<String> readInput() {
        Scanner scanner = new Scanner(System.in);
        List<String> input = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            input.add(line);
        }

        return input;
    }
}
