package advanced_java_8.functional_interfaces;

import java.util.function.Predicate;

public class PredicateExample {
    //Good for code re-use ability

    //Takes in an input and returns true false

    static Predicate<Integer> p = (i) -> {
        return (i % 2 == 0);
    };

    //Refactored way
    static Predicate<Integer> p1 = (i) -> (i % 2) == 0;
    static Predicate<Integer> p2 = (i) -> (i % 5) == 0;

    public static void predicateAnd() {
        System.out.println("Predicate and result is:" + p1.and(p2).test(10));
        System.out.println("Predicate and result is:" + p1.and(p2).test(9));
    }

    public static void predicateOr() {
        System.out.println("Predicate or result is:" + p1.or(p2).test(10));
        System.out.println("Predicate or result is:" + p1.or(p2).test(8));
    }

    public static void predicateNegate() {
        System.out.println("Predicate or negate result is:" + p1.or(p2).negate().test(8));
    }

    public static void main(String[] args) {
        System.out.println(p.test(4));
        System.out.println(p1.test(4));
        predicateAnd();
        predicateOr();
        predicateNegate();
    }
}
