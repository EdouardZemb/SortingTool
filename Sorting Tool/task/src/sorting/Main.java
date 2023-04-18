package sorting;

import java.util.*;

public class Main {
    public static void main(final String[] args) {
        InputReader inputReader = new ConsoleInputReader();
        List<Integer> numbers = inputReader.readNumbers();

        NumberAnalyzer numberAnalyzer = new NumberAnalyzer();
        NumberStats stats = numberAnalyzer.analyze(numbers);

        OutputFormatter outputFormatter = new ConsoleOutputFormatter();
        String output = outputFormatter.format(stats);

        System.out.println(output);
    }
}
