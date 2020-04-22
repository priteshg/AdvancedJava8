package advanced_java_8.method_reference;

import advanced_java_8.data.Student;
import advanced_java_8.data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {
    /**
     * classname::methodName
     */

    static Consumer<Student> c1 = System.out::println;

    /**
     * classname::instanceMethodName
     */
    static Consumer<Student> c2 = Student::printListOfActivities;

    public static void main(String[] args) {
        StudentDataBase.getAllStudents().forEach(c1);
        StudentDataBase.getAllStudents().forEach(c2);
    }
}
