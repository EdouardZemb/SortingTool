package sorting;

import java.util.Scanner;

public class LineInputReader implements InputReader<String> {
    @Override
    public void readInput(InputList<String> inputList) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            inputList.add(scanner.nextLine());
        }
    }
}
