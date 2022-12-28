package sorting;

import org.jetbrains.annotations.NotNull;

public class Line implements Comparable<Line> {
    private final String VALUE;
    public Line(String nextLine) {
        VALUE = nextLine;
    }

    @Override
    public int compareTo(@NotNull Line line) {
        return VALUE.compareTo(line.VALUE);
    }

    @Override
    public String toString() {
        return VALUE;
    }
}
