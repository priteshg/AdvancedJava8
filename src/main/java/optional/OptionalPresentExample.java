package advanced_java_8.optional;

import java.util.Optional;

public class OptionalPresentExample {

    public static void main(String[] args) {
        //isPresent
        Optional<String> optional = Optional.ofNullable(null);
        System.out.println(optional.isPresent());
        //ifPresent

        optional.ifPresent(s -> System.out.println(s));

        }
    }


