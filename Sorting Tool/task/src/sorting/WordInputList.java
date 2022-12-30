package sorting;

import java.util.Scanner;
import java.util.regex.Pattern;

public class WordInputList extends InputList<Word> {
    private final Pattern PATTERN = Pattern.compile("\\S+");
    public WordInputList() {
        super(DataType.WORD);
    }

    @Override
    public Word findNextFrom(Scanner scanner) {
        return new Word(scanner.next(PATTERN));
    }

    @Override
    public boolean hasNextIn(Scanner scanner) {
        return scanner.hasNext(PATTERN);
    }
}
