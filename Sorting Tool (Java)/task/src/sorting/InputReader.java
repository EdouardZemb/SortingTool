package sorting;

import java.util.List;

public interface InputReader<T> {
    List<T> read();
    InputType getInputType();
}
