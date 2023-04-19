package sorting;

import junit.framework.TestCase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LineAnalyzerTest extends TestCase {

    public void testAnalyzeEmptyList() {
        LineAnalyzer lineAnalyzer = new LineAnalyzer();

        // Test empty list
        List<String> emptyList = new ArrayList<>();
        DataStats<String> emptyStats = lineAnalyzer.analyze(emptyList);
        assertEquals(0, emptyStats.getCount());
        assertNull(emptyStats.getMax());
        assertEquals(0, emptyStats.getMaxCount());
        assertEquals(0.0, emptyStats.getMaxPercentage());
    }
    public void testAnalyzeOneLineList() {
        LineAnalyzer lineAnalyzer = new LineAnalyzer();

        // Test list with one line
        List<String> oneLineList = List.of("hello world");
        DataStats<String> oneLineStats = lineAnalyzer.analyze(oneLineList);
        assertEquals(1, oneLineStats.getCount());
        assertEquals("hello world", oneLineStats.getMax());
        assertEquals(1, oneLineStats.getMaxCount());
        assertEquals(100.0, oneLineStats.getMaxPercentage());
    }
    public void testAnalyzeMultipleLinesList_NoDuplicates() {
        LineAnalyzer lineAnalyzer = new LineAnalyzer();

        // Test list with multiple lines, no duplicates
        List<String> noDuplicateList = Arrays.asList("hello", "world", "this is", "a test");
        DataStats<String> noDuplicateStats = lineAnalyzer.analyze(noDuplicateList);
        assertEquals(4, noDuplicateStats.getCount());
        assertEquals("this is", noDuplicateStats.getMax());
        assertEquals(1, noDuplicateStats.getMaxCount());
        assertEquals(25.0, noDuplicateStats.getMaxPercentage());
    }

    public void testAnalyzeMultipleLinesList_Duplicates() {
        LineAnalyzer lineAnalyzer = new LineAnalyzer();

        // Test list with multiple lines and duplicates
        List<String> duplicateList = Arrays.asList("hello", "world", "this is", "world", "world", "this is");
        DataStats<String> duplicateStats = lineAnalyzer.analyze(duplicateList);
        assertEquals(6, duplicateStats.getCount());
        assertEquals("this is", duplicateStats.getMax());
        assertEquals(2, duplicateStats.getMaxCount());
        assertEquals(33.0, duplicateStats.getMaxPercentage());
    }
}
