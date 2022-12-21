package sorting;

import java.util.ArrayList;
import java.util.List;

public class LongInputList {
    private final List<LongInput> LongInputs = new ArrayList<>();

    public void add(LongInput longValue) {
        LongInputs.add(longValue);
    }

    public List<LongInput> getLongInputs() {
        return LongInputs;
    }

    public LongInput getMaxValue() {
        return LongInputs.stream().reduce(new LongInput(0L), LongInput::max);
    }

    public int getSize() {
        return LongInputs.size();
    }

    public int getMaxValueFrequency() {
        return getMaxValue().frequency(this);
    }
}
