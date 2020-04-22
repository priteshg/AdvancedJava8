package com.learn.java.streams_terminal;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

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
