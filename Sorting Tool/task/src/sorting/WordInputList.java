package sorting;

import java.util.Scanner;
import java.util.regex.Pattern;

public class WordInputList extends InputList<Word> {
    public WordInputList() {
        super(DataType.WORD);
    }

    @Override
    void read() {
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("\\w+");
        while (scanner.hasNext(pattern)) {
            Word word = new Word(scanner.next(pattern));
            inputList.add(word);
        }
    }
}
