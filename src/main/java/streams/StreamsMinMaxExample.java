package advanced_java_8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinMaxExample {

    public static int findMaxValue(List<Integer> integers) {
        //6,7,8,9,10
        return integers.stream().reduce(0, (x, y) -> x > y ? x : y);
    }


    public static int findMinValue(List<Integer> integers) {
        //6,7,8,9,10
        return integers.stream().reduce(0, (x, y) -> x < y ? x : y);
    }

    public static Optional<Integer> findMaxValueOptional(List<Integer> integers) {
        //6,7,8,9,10
        return integers.stream().reduce((x, y) -> x > y ? x : y);
    }

    public static void main(String[] args) {
        //List<Integer> integerList = Arrays.asList(6, 7, 8, 9, 10, 0, 1);
        List<Integer> integerList = new ArrayList<>();

        System.out.println(findMaxValue(integerList));

        Optional<Integer> maxValue = findMaxValueOptional(integerList);

        if (maxValue.isPresent()) {
            System.out.println("max value is:" + maxValue.get());
        } else {
            System.out.println("No max value found");
        }
    }

}
