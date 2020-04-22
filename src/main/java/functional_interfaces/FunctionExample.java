package advanced_java_8.functional_interfaces;

import java.util.function.Function;

public class FunctionExample {

    static Function<String, String> function = (name) -> name.toUpperCase();

    static Function<String, String> addSomeString = (name) -> name.toUpperCase().concat("default");

    public static void main(String[] args) {
        System.out.println("Results is : " + function.apply("java8"));
        System.out.println("Results of and then is : " + function.andThen(addSomeString).apply("java8"));
        //compose  - Execute the compose function first the the otter function
        System.out.println("Results of and then is : " + function.compose(addSomeString).apply("java8"));

    }


}
