package sorting;

import junit.framework.TestCase;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DataStatsImplTest extends TestCase {

    private DataStatsImpl<String> dataStats;

    protected void setUp() {
        List<String> data = Arrays.asList("apple", "banana", "banana", "cherry", "date", "date", "date");
        Collections.sort(data);
        dataStats = new DataStatsImpl<>(7, "date", 3, data, 42.857);
    }

    public void testGetCount() {
        assertEquals(7, dataStats.getCount());
    }

    public void testGetMax() {
        assertEquals("date", dataStats.getMax());
    }

    public void testGetMaxWithEmptyString() {
        DataStatsImpl<String> dataStatsWithEmptyString = new DataStatsImpl<>(7, "", 3, null, 42.857);
        assertNull(dataStatsWithEmptyString.getMax());
    }

    public void testGetMaxCount() {
        assertEquals(3, dataStats.getMaxCount());
    }

    public void testGetSortedData() {
        List<String> expectedSortedData = Arrays.asList("apple", "banana", "banana", "cherry", "date", "date", "date");
        assertEquals(expectedSortedData, dataStats.getSortedData());
    }

    public void testGetMaxPercentage() {
        assertEquals(42.857, dataStats.getMaxPercentage());
    }
}
