package sorting;

/**
 * This class is used to create an input reader for the input type specified.
 */
public class InputTypeArgumentHandler extends AbstractArgumentHandler<InputType> {
    private InputReader<?> inputReader;

    public InputTypeArgumentHandler(InputType inputType) {
        super(inputType);
    }

    /**
     * Initializes the input reader for the specified input type.
     * This method should be called only once after the InputTypeArgument is created.
     * @throws IllegalStateException if the input reader could not be created.
     */
    @Override
    public void execute() {
        InputReader<?> inputReader = InputReaderFactory.create(argument);
        assert inputReader != null;
        setReader(inputReader);
    }

    private void setReader(InputReader<?> inputReader) {
        this.inputReader = inputReader;
    }
    public InputReader getReader() {
        return inputReader;
    }
}
