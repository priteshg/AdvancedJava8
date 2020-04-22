package com.learn.java.method_reference;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {
    /**
     * classname::methodName
     */

    static Consumer<Student> c1 = System.out::println;

    /**
     * classname::instanceMethodName
     */
    static Consumer<Student> c2 = Student::printListOfActivities;

    public static void main(String[] args) {
        StudentDataBase.getAllStudents().forEach(c1);
        StudentDataBase.getAllStudents().forEach(c2);
    }
}
