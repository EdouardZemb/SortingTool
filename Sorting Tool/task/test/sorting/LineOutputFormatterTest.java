package sorting;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

public class LineOutputFormatterTest extends TestCase {

    public void testFormat() {
        List<String> data = new ArrayList<>();
        data.add("hello world");
        data.add("foo bar");
        data.add("this is a test");

        DataStats<String> stats = new DataStatsImpl<>(data.size(), "this is a test", 1, data, 33.3);

        LineOutputFormatter formatter = new LineOutputFormatter();
        String formatted = formatter.format(stats);

        String expected = "Total lines: 3.\r\nThe longest line:\r\nthis is a test\r\n(1 time(s), 33,300000%).\r\n";

        assertEquals(expected, formatted);
    }

    public void testFormatEmptyData() {
        List<String> data = new ArrayList<>();
        @SuppressWarnings("all")
        DataStats<String> stats = new DataStatsImpl<>(data.size(), null, 0, data, 0.0);

        LineOutputFormatter formatter = new LineOutputFormatter();
        String formatted = formatter.format(stats);

        String expected = "Total lines: 0.\r\nThe longest line:\r\nNo data to display\r\n(0 time(s), 0,000000%).\r\n";

        assertEquals(expected, formatted);
    }

    public void testFormatMultipleMaxLines() {
        List<String> data = new ArrayList<>();
        data.add("hello world");
        data.add("foo bar");
        data.add("this is a test");
        data.add("this is a test");

        DataStats<String> stats = new DataStatsImpl<>(data.size(), "this is a test", 2, data, 50.0);

        LineOutputFormatter formatter = new LineOutputFormatter();
        String formatted = formatter.format(stats);

        String expected = "Total lines: 4.\r\nThe longest line:\r\nthis is a test\r\n(2 time(s), 50,000000%).\r\n";
        assertEquals(expected, formatted);
    }
}
