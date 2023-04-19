package sorting;

import junit.framework.TestCase;

public class DataAnalyzerFactoryTest extends TestCase {

    public void testCreateWordAnalyzer() {
        DataAnalyzer<?> analyzer = DataAnalyzerFactory.create(InputType.WORD);
        assertTrue(analyzer instanceof WordAnalyzer);
    }

    public void testCreateLineAnalyzer() {
        DataAnalyzer<?> analyzer = DataAnalyzerFactory.create(InputType.LINE);
        assertTrue(analyzer instanceof LineAnalyzer);
    }

    public void testCreateLongAnalyzer() {
        DataAnalyzer<?> analyzer = DataAnalyzerFactory.create(InputType.LONG);
        assertTrue(analyzer instanceof LongAnalyzer);
    }

    public void testCreateUnknownDataType() {
        try {
            @SuppressWarnings("unused")
            DataAnalyzer<?> analyzer = DataAnalyzerFactory.create(null);
            fail("IllegalArgumentException not thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Data type cannot be null", e.getMessage());
        }
    }
}