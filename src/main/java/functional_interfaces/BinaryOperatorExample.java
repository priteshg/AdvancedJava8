package advanced_java_8.functional_interfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

/**
 *
 * Binary Operators Takes two inputs and returns one output all of the same type
 */

public class BinaryOperatorExample {

    static Comparator<Integer> comparator = (a, b) -> a.compareTo(b);

    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (a, b) -> a * b;
        System.out.println(binaryOperator.apply(10, 5));

        BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
        System.out.println("Result of MaxBy is:" + maxBy.apply(4, 5));

        BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
        System.out.println("Result of MinBy is:" + minBy.apply(4, 5));
    }
}
