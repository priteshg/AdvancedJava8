package advanced_java_8.streams;

import advanced_java_8.data.Student;
import advanced_java_8.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class StreamsComparatorExample {

    public static List<Student> sortedStudentsByName() {
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(toList());
    }

    public static List<Student> sortedStudentsByGPA() {
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .collect(toList());
    }

    public static List<Student> sortedStudentsByGPADesc() {
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(toList());
    }


    public static void main(String[] args) {
        System.out.println("students sorted by name : ");
        sortedStudentsByName().forEach(System.out::println);

        System.out.println("students sorted by GPA : ");
        sortedStudentsByGPA().forEach(System.out::println);

        System.out.println("students sorted by GPA desc : ");
        sortedStudentsByGPADesc().forEach(System.out::println);

    }
}
