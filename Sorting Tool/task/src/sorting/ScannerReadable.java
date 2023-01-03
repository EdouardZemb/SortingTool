package sorting;

// Interface representing a list that can be read from a Scanner
interface ScannerReadable<T extends Comparable<T>> {
    void read();
}