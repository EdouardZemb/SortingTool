package sorting;

public interface InputReader<T extends Comparable<T>> {
    void readInput(InputList<T> inputList);
}