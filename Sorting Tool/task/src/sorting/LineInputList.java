package sorting;

import java.util.Scanner;

// Concrete class representing a list of line values
public class LineInputList extends InputList<String> {
    public LineInputList() {
        super(DataType.LINE);
    }

    @Override
    public void read() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            inputList.add(scanner.nextLine());
        }
    }
}
