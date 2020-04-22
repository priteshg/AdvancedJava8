package advanced_java_8.method_reference;

import java.util.function.Function;

public class FunctionalMethodReferenceExample {


    static Function<String, String> toUppercase = (s) -> s.toUpperCase();
    static Function<String, String> toUppercaseMethodReference = String::toUpperCase;

    public static void main(String[] args) {
        System.out.println(toUppercase.apply("java8"));
        System.out.println(toUppercaseMethodReference.apply("java8_method_reference"));
    }
}
