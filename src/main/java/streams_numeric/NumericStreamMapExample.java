package advanced_java_8.streams_numeric;

import java.util.List;
import java.util.stream.IntStream;

import static java.lang.String.format;
import static java.util.stream.Collectors.toList;

public class NumericStreamMapExample {

    public static List<Integer> mapToObj() {
        return IntStream.rangeClosed(1, 5)
                .mapToObj((i) -> {
                    return new Integer(i);
                })
                .collect(toList());
    }

    public static long mapToLong() {
        return IntStream.rangeClosed(1, 5)
                .mapToLong((i) -> i)
                .sum();
    }

    public static double mapToDouble() {
        return IntStream.rangeClosed(1, 5)
                .mapToDouble((i) -> i)
                .sum();
    }

    public static void main(String[] args) {
        System.out.println(format("map to object: %s", mapToObj()));
        System.out.println(format("map to Long: %s", mapToLong()));
        System.out.println(format("map to Double: %s", mapToDouble()));
    }
}
