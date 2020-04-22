package advanced_java_8.streams;

import advanced_java_8.data.Student;
import advanced_java_8.data.StudentDataBase;

import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class StreamsMapExample {

    static List<String> namesList() {
        List<String> nameList = StudentDataBase.getAllStudents().stream()//Stream <Student>
                //Student as an input and name as output
                .map(Student::getName) //Stream<String>
                .map(String::toUpperCase) //Stream<String> -> uppercase operation on each input
                .collect(toList());
        return nameList;
    }

    static Set<String> namesSet() {
        Set<String> namesSet = StudentDataBase.getAllStudents().stream()//Stream <Student>
                //Student as an input and name as output
                .map(Student::getName) //Stream<String>
                .map(String::toUpperCase) //Stream<String> -> uppercase operation on each input
                .collect(toSet());
        return namesSet;
    }

    public static void main(String[] args) {
        System.out.println(namesList());
        System.out.println(namesSet());
    }
}
