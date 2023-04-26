package sorting;

/**
 * This class is responsible for parsing the command line arguments.
 */
public class CommandLineParser {
    private final String[] args;

    public CommandLineParser(String[] args) {
        this.args = args;
    }

    public SortingType getSortingType() {
        for (int i = 0; i < args.length; i++) {
            String arg = args[i];

            if (ArgumentType.SORT_TYPE.equals(arg)) {
                return SortingType.fromValue(args[i + 1]);
            }
        }
        return SortingType.NATURAL;
    }

    public InputType getInputType() {
        for (int i = 0; i < args.length; i++) {
            String arg = args[i];

            if (ArgumentType.DATA_TYPE.equals(arg)) {
                return InputType.fromValue(args[i + 1]);
            }
        }
        return InputType.WORD;
    }
}
