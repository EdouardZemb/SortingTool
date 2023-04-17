package sorting;

import java.util.Scanner;
import java.util.regex.Pattern;


public class WordInputReader implements InputReader<String> {
    @Override
    public void readInput(InputList<String> inputList) {
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("\\S+");
        while (scanner.hasNext(pattern)) {
            inputList.add(scanner.next(pattern));
        }
    }
}
