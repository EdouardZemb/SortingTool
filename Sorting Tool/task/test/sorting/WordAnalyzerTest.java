package sorting;

import junit.framework.TestCase;

import java.util.Arrays;
import java.util.List;

public class WordAnalyzerTest extends TestCase {

    public void testAnalyze() {
        WordAnalyzer wordAnalyzer = new WordAnalyzer();
        List<String> data = Arrays.asList(
                "the quick brown fox jumps over the lazy dog",
                "the quick brown fox jumps over the lazy dog",
                "the quick brown fox jumps over the lazy dog",
                "the quick brown fox jumps over the lazy dog",
                "the quick brown fox jumps over the lazy dog"
        );
        DataStats<String> dataStats = wordAnalyzer.analyze(data);
        assertEquals(45, dataStats.getCount());
        assertEquals("quick", dataStats.getMax());
        assertEquals(5, dataStats.getMaxCount());
        // assertEquals(Arrays.asList("the", "brown", "fox", "jumps", "lazy", "over", "quick", "dog"), dataStats.getSortedData());
        assertEquals(11, dataStats.getMaxPercentage(), 0.001);
    }

    public void testAnalyzeEmptyData() {
        WordAnalyzer wordAnalyzer = new WordAnalyzer();
        List<String> data = List.of();
        DataStats<String> dataStats = wordAnalyzer.analyze(data);
        assertEquals(0, dataStats.getCount());
        assertNull(dataStats.getMax());
        assertEquals(0, dataStats.getMaxCount());
        assertEquals(List.of(), dataStats.getSortedData());
        assertEquals(0, dataStats.getMaxPercentage(), 0.001);
    }

    public void testAnalyzeSingleWord() {
        WordAnalyzer wordAnalyzer = new WordAnalyzer();
        List<String> data = List.of("hello");
        DataStats<String> dataStats = wordAnalyzer.analyze(data);
        assertEquals(1, dataStats.getCount());
        assertEquals("hello", dataStats.getMax());
        assertEquals(1, dataStats.getMaxCount());
        // assertEquals(List.of("hello"), dataStats.getSortedData());
        assertEquals(100, dataStats.getMaxPercentage(), 0.001);
    }

    public void testAnalyzeSingleLine() {
        WordAnalyzer wordAnalyzer = new WordAnalyzer();
        List<String> data = List.of("hello world");
        DataStats<String> dataStats = wordAnalyzer.analyze(data);
        assertEquals(2, dataStats.getCount());
        assertEquals("hello", dataStats.getMax());
        assertEquals(1, dataStats.getMaxCount());
        // assertEquals(Arrays.asList("hello", "world"), dataStats.getSortedData());
        assertEquals(50, dataStats.getMaxPercentage(), 0.001);
    }

}


