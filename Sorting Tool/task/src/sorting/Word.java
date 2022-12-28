package sorting;

import org.jetbrains.annotations.NotNull;

public class Word implements Comparable<Word> {
    private final String VALUE;

    public Word(String value) {
        VALUE = value;
    }

    @Override
    public int compareTo(@NotNull Word word) {
        return VALUE.compareTo(word.VALUE);
    }

    @Override
    public String toString() {
        return VALUE;
    }
}