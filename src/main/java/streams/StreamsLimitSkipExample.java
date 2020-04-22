package advanced_java_8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitSkipExample {
    public static Optional<Integer> limit(List<Integer> integers) {
        //6,7,8,9,10
        return integers.stream().limit(3).reduce((x, y) -> x + y);
    }

    public static Optional<Integer> skip(List<Integer> integers) {
        //6,7,8,9,10
        return integers.stream().skip(3).reduce((x, y) -> x + y);

    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(6, 7, 8, 9, 10);
        //List<Integer> integers = new ArrayList<>();
        Optional<Integer> limitResult = limit(integers);
        if (limitResult.isPresent()) {
            System.out.println("Result is: " + limitResult.get());
        } else {
            System.out.println("No input is present");
        }

        Optional<Integer> skipResult = skip(integers);
        if (skipResult.isPresent()) {
            System.out.println("skipResult is: " + skipResult.get());
        } else {
            System.out.println("No input is present");
        }
    }
}
