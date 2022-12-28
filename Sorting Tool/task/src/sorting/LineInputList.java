package sorting;

import java.util.Scanner;

public class LineInputList extends InputList<Line> {
    public LineInputList() {
        super(DataType.LINE);
    }

    @Override
    void read() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            Line line = new Line(scanner.nextLine());
            inputList.add(line);
        }
    }
}
