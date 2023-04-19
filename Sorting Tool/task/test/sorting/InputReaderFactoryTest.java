package sorting;

import junit.framework.TestCase;

public class InputReaderFactoryTest extends TestCase {

    public void testCreateLongInputReader() {
        InputType inputType = InputType.LONG;
        InputReader expectedReader = new LongInputReader();
        InputReader actualReader = InputReaderFactory.create(inputType);
        assertEquals(expectedReader.getClass(), actualReader.getClass());
    }

    public void testCreateLineInputReader() {
        InputType inputType = InputType.LINE;
        InputReader expectedReader = new LineInputReader();
        InputReader actualReader = InputReaderFactory.create(inputType);
        assertEquals(expectedReader.getClass(), actualReader.getClass());
    }

    public void testCreateWordInputReader() {
        InputType inputType = InputType.WORD;
        InputReader expectedReader = new WordInputReader();
        InputReader actualReader = InputReaderFactory.create(inputType);
        assertEquals(expectedReader.getClass(), actualReader.getClass());
    }

    public void testCreateNullInputReader() {
        try {
            @SuppressWarnings("unused")
            InputReader actualReader = InputReaderFactory.create(null);
            fail("IllegalArgumentException not thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Data type cannot be null", e.getMessage());
        }
    }
}
