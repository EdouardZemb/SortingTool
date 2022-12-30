package sorting;

import java.util.Scanner;

/**
 * Allows to manipulate a scanner to retrieve data
 * @param <T> Type of data to retrieve
 */
public interface ScannerReadable<T> {
    T findNextFrom(Scanner scanner);

    boolean hasNextIn(Scanner scanner);
}
