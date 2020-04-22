package com.learn.java.streams_terminal;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

import static java.lang.String.format;
import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.toSet;

public class StreamsPartitioningByExample {

    public static void partition_by_1() {
        Predicate<Student> gpaPredicate = (s -> s.getGpa() >= 3.8);
        Map<Boolean, List<Student>> partitioningMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(partitioningBy(gpaPredicate));
        System.out.println(partitioningMap);
    }

    public static void partition_by_2() {
        Predicate<Student> gpaPredicate = (s -> s.getGpa() >= 3.8);

        Map<Boolean, Set<Student>> partitioningMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(partitioningBy(gpaPredicate, toSet()));

        System.out.println(partitioningMap);
    }

    public static void main(String[] args) {
        //partition_by_1();
        partition_by_2();
    }
}
