package streams_terminal;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Set;

import static java.lang.String.format;
import static java.util.stream.Collectors.*;

public class StreamsMappingExample {


    public static List<String> mapStudents() {
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(toList());
    }

    public static Set<String> mapStudentsSet() {
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(mapping(Student::getName, toSet()));
    }

    public static void main(String[] args) {
        System.out.println(format("list: %s", mapStudents()));
        System.out.println(format("set: %s", mapStudentsSet()));
    }
}
