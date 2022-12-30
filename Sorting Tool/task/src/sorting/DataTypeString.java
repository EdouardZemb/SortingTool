package sorting;

import org.jetbrains.annotations.NotNull;

public abstract class DataTypeString<T extends DataTypeString<T>> implements Comparable<T> {
    private final String VALUE;

    protected DataTypeString(String value) {
        VALUE = value;
    }

    public int length() {
        return VALUE.length();
    }

    public String getVALUE() {
        return VALUE;
    }

    @Override
    public int compareTo(@NotNull T t) {
        if (length() > t.length()) {
            return 1;
        } else if (t.length() > length()) {
            return -1;
        }
        return VALUE.compareTo(t.getVALUE());
    }

    @Override
    public String toString() {
        return VALUE;
    }
}
