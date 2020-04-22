package advanced_java_8.streams_terminal;

import advanced_java_8.data.Student;
import advanced_java_8.data.StudentDataBase;

import static java.lang.String.format;
import static java.util.stream.Collectors.averagingInt;
import static java.util.stream.Collectors.summingInt;


public class StreamsSumAvgExample {

    public static int sumExample() {
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(summingInt(Student::getNoteBooks));
    }

    public static double AveragingExample() {
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(averagingInt(Student::getNoteBooks));
    }

    public static void main(String[] args) {
        System.out.println(format("Sum %s", sumExample()));
        System.out.println(format("Average %s", AveragingExample()));
    }
}
