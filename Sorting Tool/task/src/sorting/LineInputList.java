package sorting;

import java.util.Scanner;

public class LineInputList extends InputList<Line> {
    public LineInputList() {
        super( DataType.LINE);
    }

    @Override
    public Line findNextFrom(Scanner scanner) {
        return new Line(scanner.nextLine());
    }

    @Override
    public boolean hasNextIn(Scanner scanner) {
        return scanner.hasNextLine();
    }
}
