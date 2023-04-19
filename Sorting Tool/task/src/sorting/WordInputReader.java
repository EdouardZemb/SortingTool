package sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordInputReader implements InputReader {
    @Override
    public List<String> readInput() {
        Scanner scanner = new Scanner(System.in);
        List<String> input = new ArrayList<>();

        while (scanner.hasNext()) {
            String word = scanner.next();
            input.add(word);
        }

        return input;
    }
}
