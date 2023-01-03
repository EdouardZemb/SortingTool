package sorting;

import java.util.Scanner;
import java.util.regex.Pattern;

// Concrete class representing a list of word values
public class WordInputList extends InputList<String> {
    public WordInputList() {
        super(DataType.WORD);
    }

    @Override
    public void read() {
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("\\S+");
        while (scanner.hasNext(pattern)) {
            inputList.add(scanner.next(pattern));
        }
    }
}
