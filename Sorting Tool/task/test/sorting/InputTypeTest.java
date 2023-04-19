package sorting;

import junit.framework.TestCase;

public class InputTypeTest extends TestCase {

    public void testFromValue_LongInputType() {
        InputType inputType = InputType.fromValue("long");
        assertEquals(InputType.LONG, inputType);
    }

    public void testFromValue_LineInputType() {
        InputType inputType = InputType.fromValue("line");
        assertEquals(InputType.LINE, inputType);
    }

    public void testFromValue_WordInputType() {
        InputType inputType = InputType.fromValue("word");
        assertEquals(InputType.WORD, inputType);
    }

    public void testFromValue_InvalidInputType() {
        try {
            InputType inputType = InputType.fromValue("invalid");
            fail("IllegalArgumentException not thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid input type: invalid", e.getMessage());
        }
    }
}
