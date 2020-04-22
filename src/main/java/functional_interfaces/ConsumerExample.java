package advanced_java_8.functional_interfaces;

import advanced_java_8.data.Student;
import advanced_java_8.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    static Consumer<Student> c2 = (s) -> System.out.println(s.toString());
    static Consumer<Student> c3 = (s) -> System.out.print(s.getName());
    static Consumer<Student> c3b = (s) -> System.out.print(s.getGradeLevel());
    static Consumer<Student> c4 = (s) -> System.out.println(s.getActivities());
    static List<Student> studentList = StudentDataBase.getAllStudents();

    public static void printName() {
        List<Student> studentList = StudentDataBase.getAllStudents();
        //For each takes a consumer implementation
        studentList.forEach(c2);
    }

    public static void printNameAndActivities() {
        studentList.forEach(c3.andThen(c4)); //consumer chaining
    }

    public static void printNameAndActivitiesUsingCondition() {
        studentList.forEach((student) -> {
            if (student.getGradeLevel() >= 3) {
                c3.andThen(c3b).andThen(c4).accept(student);
            }
        }); //consumer chaining
    }


    public static void main(String[] args) {
        Consumer<String> consumer = (a) -> System.out.println(a.toUpperCase());
      //  consumer.accept("java8");
      //  printNameAndActivities();
        printNameAndActivitiesUsingCondition();
    }
}
