package advanced_java_8.streams_numeric;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamRangesExample {

    public static void main(String[] args) {
        IntStream intStream = IntStream.range(1, 50);
        System.out.println(intStream.count());

        IntStream.range(1, 50).forEach(value -> System.out.println(value + ","));

        System.out.println("Ranged Closed");
        System.out.println(IntStream.rangeClosed(1, 50).count());
        IntStream.rangeClosed(1, 50).forEach(value -> System.out.println(value + ","));

        System.out.println("Long Stream");
        System.out.println(LongStream.rangeClosed(1, 50).count());
        LongStream.rangeClosed(1, 50).forEach(value -> System.out.println(value + ","));

        System.out.println("Double Stream");
        System.out.println(IntStream.rangeClosed(1, 50).asDoubleStream().count());
        IntStream.rangeClosed(1, 50).asDoubleStream().forEach(value -> System.out.println(value + ","));


    }
}
