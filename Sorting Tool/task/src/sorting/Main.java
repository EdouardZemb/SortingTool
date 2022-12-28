package sorting;

import java.util.*;

public class Main {
    public static void main(final String[] args) {

        InputList inputList = new WordInputList();
        for (int i = 0; i < args.length; i = i+2) {
            String arg = args[i];
            if (Objects.equals(arg, "-dataType")) {
                inputList = switch (args[i + 1]) {
                    case "long" -> new LongInputList();
                    case "line" -> new LineInputList();
                    default -> new WordInputList();
                };
            }
        }

        inputList.read();
        System.out.println(inputList);
    }
}
