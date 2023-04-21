package sorting;

import java.util.List;


public class Main {
    public static void main(final String[] args) {
        ArgumentFactory argumentFactory = new ArgumentFactory(args);
        List<Argument> arguments = argumentFactory.parse();
        ArgumentProcessor processor = new ArgumentProcessor(arguments);
        processor.processArguments();
    }
}