package sorting;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class LongInputList implements Collection<LongInput> {
    private final List<LongInput> LongInputs = new ArrayList<>();

    @Override
    public int size() {
        return LongInputs.size();
    }

    @Override
    public boolean isEmpty() {
        return LongInputs.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return LongInputs.contains(o);
    }

    @NotNull
    @Override
    public Iterator<LongInput> iterator() {
        return LongInputs.iterator();
    }

    @NotNull
    @Override
    public Object[] toArray() {
        return LongInputs.toArray();
    }

    @NotNull
    @Override
    public <T> T[] toArray(@NotNull T[] ts) {
        return LongInputs.toArray(ts);
    }

    public boolean add(LongInput longValue) {
        LongInputs.add(longValue);
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return LongInputs.remove(o);
    }

    @Override
    public boolean containsAll(@NotNull Collection<?> collection) {
        return new HashSet<>(LongInputs).containsAll(collection);
    }

    @Override
    public boolean addAll(@NotNull Collection<? extends LongInput> collection) {
        return LongInputs.addAll(collection);
    }

    @Override
    public boolean removeAll(@NotNull Collection<?> collection) {
        return LongInputs.removeAll(collection);
    }

    @Override
    public boolean retainAll(@NotNull Collection<?> collection) {
        return LongInputs.retainAll(collection);
    }

    @Override
    public void clear() {
        LongInputs.clear();
    }

    public LongInput getMaxValue() {
        return Collections.max(LongInputs);
    }

    public int getSize() {
        return LongInputs.size();
    }

    public int getMaxValueFrequency() {
        return getMaxValue().frequency(this);
    }
}
