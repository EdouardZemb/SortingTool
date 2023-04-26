package sorting;

import java.util.List;

/**
 * This class processes the arguments passed to the program.
 * It also provides access to the sorter and reader objects.
 */
public class ArgumentsListHandler {
    private final Sorter sorter;
    private final InputReader reader;

    public ArgumentsListHandler(List<Executable> arguments) {
        SortingTypeArgumentHandler sortingTypeArgumentHandler = findSortingTypeArgument(arguments);
        InputTypeArgumentHandler inputTypeArgumentHandler = findInputTypeArgument(arguments);

        assert sortingTypeArgumentHandler != null;
        sortingTypeArgumentHandler.execute();
        assert inputTypeArgumentHandler != null;
        inputTypeArgumentHandler.execute();

        this.sorter = sortingTypeArgumentHandler.getSorter();
        this.reader = inputTypeArgumentHandler.getReader();
    }

    public Sorter getSorter() {
        return sorter;
    }

    public InputReader getReader() {
        return reader;
    }

    private SortingTypeArgumentHandler findSortingTypeArgument(List<Executable> arguments) {
        for (Executable argument : arguments) {
            if (argument instanceof SortingTypeArgumentHandler) {
                return (SortingTypeArgumentHandler) argument;
            }
        }
        return null;
    }

    private InputTypeArgumentHandler findInputTypeArgument(List<Executable> arguments) {
        for (Executable argument : arguments) {
            if (argument instanceof InputTypeArgumentHandler) {
                return (InputTypeArgumentHandler) argument;
            }
        }
        return null;
    }
}
