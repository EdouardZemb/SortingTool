package sorting;

public class CommandLineArgumentsParser {
    private final String[] args;
    CommandLineArgumentsParser(String[] args) {
        this.args = args;
    }
    public InputType parseInputType() {
        InputType inputType = InputType.WORD;
        for (int i = 0; i < args.length; i++) {
            if ("-dataType".equals(args[i])) {
                if (i + 1 < args.length) {
                    inputType = InputType.fromValue(args[i + 1]);
                }
            }
        }
        return inputType;
    }
}
