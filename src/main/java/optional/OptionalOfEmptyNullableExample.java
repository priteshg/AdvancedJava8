package advanced_java_8.optional;

import java.util.Optional;

public class OptionalOfEmptyNullableExample {

    public static Optional<String> ofNullable() {
        //return Optional.ofNullable(null);
        return Optional.ofNullable("Hello");
    }

    public static Optional<String> of() {
        return Optional.of("hello");
       // return Optional.of(null); //Will not work
    }

    public static Optional<String> empty() {
        return Optional.empty();
    }
    public static void main(String[] args) {
        System.out.println("OfNullable " + ofNullable());


        System.out.println("of " + of());
        System.out.println("empty " + empty());
    }
}
