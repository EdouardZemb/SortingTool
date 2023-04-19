package sorting;

import junit.framework.TestCase;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class LineInputReaderTest extends TestCase {

    public void testReadInputEmpty() {
        String inputString = "";
        InputStream inputStream = new ByteArrayInputStream(inputString.getBytes());
        System.setIn(inputStream);

        LineInputReader lineInputReader = new LineInputReader();
        List<String> expected = new ArrayList<>();
        List<String> actual = lineInputReader.readInput();
        assertEquals(expected, actual);
    }

    public void testReadInputSingleLine() {
        String inputString = "Hello world!";
        InputStream inputStream = new ByteArrayInputStream(inputString.getBytes());
        System.setIn(inputStream);

        LineInputReader lineInputReader = new LineInputReader();
        List<String> expected = new ArrayList<>();
        expected.add("Hello world!");
        List<String> actual = lineInputReader.readInput();
        assertEquals(expected, actual);
    }

    public void testReadInputMultipleLines() {
        String inputString = "Hello\nworld\n!\n";
        InputStream inputStream = new ByteArrayInputStream(inputString.getBytes());
        System.setIn(inputStream);

        LineInputReader lineInputReader = new LineInputReader();
        List<String> expected = new ArrayList<>();
        expected.add("Hello");
        expected.add("world");
        expected.add("!");
        List<String> actual = lineInputReader.readInput();
        assertEquals(expected, actual);
    }
}
