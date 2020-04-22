package com.learn.java.defaults;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaultMethodsExample2 {

    static Consumer<Student> studentConsumer = (student -> System.out.println(student));
    static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
    static Comparator<Student> gradeComparator = Comparator.comparing(Student::getGradeLevel);

    public static void sortByName(List<Student> studentList) {
        System.out.println("After sort..");
        studentList.sort(nameComparator);
    }


    public static void sortByGPA(List<Student> studentList) {
        System.out.println("After sort..");
        Comparator<Student> nameComparator = Comparator.comparingDouble(Student::getGpa); //s -> s.getName()
        studentList.sort(nameComparator);
    }

    //Comparator chaining

    public static void comparatorChaining(List<Student> studentList) {
        System.out.println("After comparatorChaining...");
        studentList.sort(gradeComparator.thenComparing(nameComparator));
    }

    public static void sortWithNullValues(List<Student> studentList) {
        System.out.println("After sortWithNullValues...");
        Comparator<Student> studentComparator = Comparator.nullsFirst(nameComparator);
        studentList.sort(studentComparator);
    }

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        System.out.println("Before sort..");
        //System.out.println(studentList);
        studentList.forEach(studentConsumer);
        //sortByGPA(studentList);
        //sortByName(studentList);
        //comparatorChaining(studentList);
        sortWithNullValues(studentList);
        studentList.forEach(studentConsumer);


    }


}
