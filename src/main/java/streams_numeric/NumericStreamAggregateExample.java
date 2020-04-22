package advanced_java_8.streams_numeric;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamAggregateExample {

    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(1, 50).sum();
        System.out.println("Sum is : " + sum);

        OptionalInt optionalInteger = IntStream.rangeClosed(1, 50).max();
        System.out.println("max value is : " + optionalInteger.getAsInt());
        System.out.println(optionalInteger.isPresent() ? optionalInteger.getAsInt() : 0);

        OptionalLong optionalLong = LongStream.rangeClosed(50, 100).min();
        System.out.println(optionalLong.isPresent() ? optionalLong.getAsLong() : 0);

        OptionalDouble av = IntStream.rangeClosed(1, 50).average();
        System.out.println(av.isPresent() ? av.getAsDouble() : 0);


    }
}
