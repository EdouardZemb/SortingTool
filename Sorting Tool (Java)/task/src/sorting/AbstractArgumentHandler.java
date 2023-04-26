package sorting;

public abstract class AbstractArgumentHandler<T> implements Executable {
    protected final T argument;

    protected AbstractArgumentHandler(T argument) {
        this.argument = argument;
    }
}
