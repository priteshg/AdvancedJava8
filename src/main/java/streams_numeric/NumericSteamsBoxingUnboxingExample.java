package advanced_java_8.streams_numeric;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericSteamsBoxingUnboxingExample {

    public static List<Integer> boxing() {
        return IntStream.rangeClosed(1, 10)
                .boxed()
                .collect(Collectors.toList());

    }

    public static int unBoxing(List<Integer> integerList) {
        return integerList.stream()
                //wrapper Integer Values
                .mapToInt(Integer::intValue)
                .sum();
    }

    public static void main(String[] args) {
        System.out.println(String.format("Boxing :%s", boxing()));

        System.out.println(String.format("Boxing :%s", unBoxing(Arrays.asList(1, 2, 3, 4))));
    }
}
