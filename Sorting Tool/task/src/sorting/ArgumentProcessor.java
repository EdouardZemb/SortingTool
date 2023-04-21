package sorting;

import java.util.List;


public class ArgumentProcessor {
    private final List<Argument> arguments;
    public ArgumentProcessor(List<Argument> arguments) {
        this.arguments = arguments;
    }

    public void processArguments() {
        for (Argument argument : arguments) {
            argument.execute();
        }
    }
}
