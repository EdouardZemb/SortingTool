package sorting;

import java.util.ArrayList;
import java.util.List;

/**
 * Creates a list of arguments based on the sorting and input types.
 */
public class ArgumentFactory {
    private final SortingType sortingType;
    private final InputType inputType;

    public ArgumentFactory(SortingType sortingType, InputType inputType) {
        this.sortingType = sortingType;
        this.inputType = inputType;
    }

    public List<Executable> createArgumentList() {
        List<Executable> arguments = new ArrayList<>();
        arguments.add(new SortingTypeArgumentHandler(sortingType));
        arguments.add(new InputTypeArgumentHandler(inputType));
        return arguments;
    }
}
