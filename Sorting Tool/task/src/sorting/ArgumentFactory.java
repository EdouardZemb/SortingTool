package sorting;

import java.util.ArrayList;
import java.util.List;


public class ArgumentFactory {
    private final String[] args;

    public ArgumentFactory(String[] args) {
        this.args = args;
    }

    public List<Argument> parse() {
        List<Argument> arguments = new ArrayList<>();

        for (int i = 0; i < args.length; i++) {
            String arg = args[i];

            if ("-sortIntegers".equals(arg)) {
                arguments.add(new SortingNumberArgument());
                break;
            }
            if ("-dataType".equals(arg)) {
                arguments.add(new InputTypeArgument(args[i + 1]));
            }
        }

        // if sorting number argument is specified, remove all other arguments
        if (arguments.stream().anyMatch(arg -> arg instanceof SortingNumberArgument)) {
            arguments.removeIf(arg -> !(arg instanceof SortingNumberArgument));
        }

        return arguments;
    }
}
