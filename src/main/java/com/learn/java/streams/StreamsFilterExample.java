package com.learn.java.streams;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterExample {

    public static List<Student> filterStudents() {
        return StudentDataBase.getAllStudents().stream()
                .filter((student -> student.getGender().equals("female")))
                .collect(Collectors.toList());
    }

    public static List<Student> filterStudentsGrade() {
        return StudentDataBase.getAllStudents().stream()
                .filter(s -> s.getGradeLevel() >= 3)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        filterStudents().forEach(System.out::println);
        System.out.println("grade filter.....");
        filterStudentsGrade().forEach(System.out::println);

    }


}
