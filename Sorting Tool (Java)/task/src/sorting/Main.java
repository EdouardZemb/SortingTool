package sorting;

import java.util.List;


public class Main {
    public static void main(final String[] args) {
        CommandLineParser parser = new CommandLineParser(args);
        SortingType sortingType = parser.getSortingType();
        InputType inputType = parser.getInputType();
        ArgumentFactory argumentFactory = new ArgumentFactory(sortingType, inputType);
        List<Executable> arguments = argumentFactory.createArgumentList();
        ArgumentsListHandler processor = new ArgumentsListHandler(arguments);
        InputReader<?> reader = processor.getReader();
        Sorter sorter = processor.getSorter();
        sorter.setData(reader.read());
        sorter.sort();
        OutputFormatter formatter = OutputFormatterFactory.create(reader.getInputType());
        assert formatter != null;
        String output = formatter.format(sorter);
        System.out.println(output);
    }
}