package advanced_java_8.streams_terminal;

import advanced_java_8.data.Student;
import advanced_java_8.data.StudentDataBase;

import java.util.Comparator;
import java.util.Optional;

import static java.lang.String.format;
import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.minBy;

public class StreamsMaxByMinByExample {

    public static Optional<Student> minByExample() {
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(minBy(Comparator.comparing(Student::getGpa)));
    }

    public static Optional<Student> maxByExample() {
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(maxBy(Comparator.comparing(Student::getGpa)));
    }
    public static void main(String[] args) {
        System.out.println(format("studen min GPA: %s",minByExample()));
        System.out.println(format("studen min GPA: %s",maxByExample()));
    }
}
