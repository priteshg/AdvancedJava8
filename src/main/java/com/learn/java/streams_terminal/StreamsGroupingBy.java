package com.learn.java.streams_terminal;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.*;

import static java.util.stream.Collectors.*;

public class StreamsGroupingBy {


    public static void groupStudentsByGender() {
        Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGender));
        System.out.println(studentMap);
    }

    public static void customizedGroupBy() {
        Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(s -> s.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE"));
        System.out.println(studentMap);
    }

    public static void twoLevelGrouping_1() {
        Map<Integer, Map<String, List<Student>>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                        groupingBy(s -> s.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE")
                ));
        System.out.println(studentMap);
    }

    public static void twoLevelGrouping_2() {
        Map<Integer, Integer> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                        summingInt(Student::getNoteBooks)
                ));
        System.out.println(studentMap);
    }

    public static void twoLevelGrouping_3() {
        Map<String, Integer> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getName,
                        summingInt(Student::getNoteBooks)
                ));
        System.out.println(studentMap);
    }

    public static void threeArgumentGroupBy() {
        LinkedHashMap<String, Set<Student>> studentLinkedHashMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getName,
                        LinkedHashMap::new, toSet()
                ));
        System.out.println(studentLinkedHashMap);
    }

    public static void calculateTopGpa() {
        Map<Integer, Optional<Student>> studentMapOptional = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                        maxBy(Comparator.comparing(Student::getGpa))
                ));

        System.out.println(studentMapOptional);
    }

    public static void calculateTopGpaWithoutOptional() {
        Map<Integer, Student> studentMapOptional = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                        collectingAndThen(maxBy(Comparator.comparing(Student::getGpa)), Optional::get)
                ));

        System.out.println(studentMapOptional);
    }


    public static void main(String[] args) {
//        groupStudentsByGender();
//        System.out.println("group by GPA...");
//        customizedGroupBy();
//        System.out.println("2 level group by");
//        twoLevelGrouping_1();

        // twoLevelGrouping_2();
//        twoLevelGrouping_3();
//        threeArgumentGroupBy();
        //calculateTopGpa();
        calculateTopGpaWithoutOptional();
    }


}
