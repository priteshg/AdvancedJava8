package costructor_reference;

import data.Student;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferenceExample {
    static Supplier<Student> studentSupplier = Student::new;

    /**
     * Take s
     */
    static Function<String, Student> studentFunction = Student::new;

    public static void main(String[] args) {
        System.out.println(studentSupplier.get());
        System.out.println(studentFunction.apply("ABC"));
    }

}
