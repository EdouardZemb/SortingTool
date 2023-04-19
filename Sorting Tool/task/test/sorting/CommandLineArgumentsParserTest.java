package sorting;

import junit.framework.TestCase;

public class CommandLineArgumentsParserTest extends TestCase {
    public void testParseInputTypeDefault() {
        String[] args = {};
        CommandLineArgumentsParser parser = new CommandLineArgumentsParser(args);
        InputType expectedInputType = InputType.WORD;
        InputType actualInputType = parser.parseInputType();
        assertEquals(expectedInputType, actualInputType);
    }

    public void testParseInputTypeWord() {
        String[] args = {"-dataType", "word"};
        CommandLineArgumentsParser parser = new CommandLineArgumentsParser(args);
        InputType expectedInputType = InputType.WORD;
        InputType actualInputType = parser.parseInputType();
        assertEquals(expectedInputType, actualInputType);
    }

    public void testParseInputTypeLine() {
        String[] args = {"-dataType", "line"};
        CommandLineArgumentsParser parser = new CommandLineArgumentsParser(args);
        InputType expectedInputType = InputType.LINE;
        InputType actualInputType = parser.parseInputType();
        assertEquals(expectedInputType, actualInputType);
    }

    public void testParseInputTypeLong() {
        String[] args = {"-dataType", "long"};
        CommandLineArgumentsParser parser = new CommandLineArgumentsParser(args);
        InputType expectedInputType = InputType.LONG;
        InputType actualInputType = parser.parseInputType();
        assertEquals(expectedInputType, actualInputType);
    }

    public void testParseInputTypeUnknown() {
        String[] args = {"-dataType", "foo"};
        CommandLineArgumentsParser parser = new CommandLineArgumentsParser(args);
        try {
            InputType actualInputType = parser.parseInputType();
            fail("IllegalArgumentException not thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid input type: foo", e.getMessage());
        }
    }
}
