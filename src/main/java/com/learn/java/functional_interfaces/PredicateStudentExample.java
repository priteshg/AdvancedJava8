package com.learn.java.functional_interfaces;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

    //check if grade > 3
    static Predicate<Student> p1 = (s) -> s.getGradeLevel() >= 3;
    static Predicate<Student> p2 = (s) -> s.getGpa() >= 3.9;

    public static void filterStudentByGradeLevel() {

        List<Student> studentList = StudentDataBase.getAllStudents();
        System.out.println("filterStudentByGradeLevel...");
        studentList.forEach(student -> {
            if (p1.test(student)) {
                System.out.println(student);
            }
        });

    }

    public static void filterStudentByGPA() {
        List<Student> studentList = StudentDataBase.getAllStudents();
        System.out.println("filterStudentByGPA...");
        studentList.forEach(student -> {
            if (p2.test(student)) {
                System.out.println(student);
            }
        });

    }

    public static void filterStudents() {
        List<Student> studentList = StudentDataBase.getAllStudents();
        System.out.println("filterStudents...");
        studentList.forEach(student -> {
            if (p2.or(p1).negate().test(student)) {
                System.out.println(student);
            }
        });

    }


    public static void main(String[] args) {
        filterStudentByGradeLevel();
        filterStudentByGPA();
        filterStudents();
    }
}
