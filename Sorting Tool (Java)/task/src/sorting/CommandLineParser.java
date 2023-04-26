package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This class is responsible for parsing the command line arguments.
 */
public class CommandLineParser {
    private List<String> args;

    public CommandLineParser(String[] args) {
        this.args = new ArrayList<>(Arrays.asList(args));
    }

    public SortingType getSortingType() {
        for (int i = 0; i < args.size() - 1; i++) {
            String arg = args.get(i);
            if (!ArgumentType.SORT_TYPE.equals(arg)) {
                continue;
            }
            String nextArg = args.get(i + 1);
            SortingType sortingType = SortingType.fromValue(nextArg);
            if (sortingType != null) {
                args.remove(i);
                args.remove(i);
                return sortingType;
            }
            System.out.println("No sorting type defined!");
            System.exit(0);
        }
        return SortingType.NATURAL;
    }

    public InputType getInputType() {
        for (int i = 0; i < args.size(); i++) {
            String arg = args.get(i);
            if (!ArgumentType.DATA_TYPE.equals(arg)) {
                continue;
            }
            String nextArg = args.get(i + 1);
            InputType inputType = InputType.fromValue(nextArg);
            if (inputType != null) {
                args.remove(i);
                args.remove(i);
                return inputType;
            }
            System.out.println("No data type defined!");
            System.exit(0);
        }
        return InputType.WORD;
    }

    public void controlArguments() {
        for (int i = 0; i < args.size(); i++) {
            String arg = args.get(i);
            if (arg.startsWith("-")) {
                System.out.println("\"" + arg + "\" isn't a valid parameter. It will be skipped.");
                args.remove(i);
                i--;
            }
        }
    }
}
