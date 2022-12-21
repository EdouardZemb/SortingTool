package sorting;

import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.Objects;

public class LongInput implements Comparable<LongInput> {
    private final Long VALUE;

    public LongInput(Long value) {
        VALUE = value;
    }
    public int frequency(LongInputList longInputList) {
        return Collections.frequency(longInputList, this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LongInput longInput = (LongInput) o;
        return VALUE.equals(longInput.VALUE);
    }

    @Override
    public int hashCode() {
        return Objects.hash(VALUE);
    }

    @Override
    public int compareTo(@NotNull LongInput aLongInput) {
        if (this.VALUE > aLongInput.VALUE) {
            return 1;
        } else if (this.VALUE < aLongInput.VALUE) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return String.valueOf(VALUE);
    }
}
