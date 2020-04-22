package advanced_java_8.streams_terminal;

import advanced_java_8.data.Student;
import advanced_java_8.data.StudentDataBase;

import java.util.stream.Collectors;

import static java.lang.String.format;

public class StreamsJoiningExample {

    public static String joining_1() {

        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining());
    }

    public static String joining_2() {
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining("-","(",")"));
    }

    public static void main(String[] args) {

        System.out.println(format("Joining student names: %s", joining_1()));
        System.out.println(format("Joining student names: %s", joining_2()));
    }

}
