package com.learn.java.optional;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.Optional;

public class OptionalOrElseExample {


    public static String optionalOrElse() {
        Optional<Student> studentOptional =
                Optional.ofNullable(StudentDataBase.studentSupplier.get());
//        Optional<Student> studentOptional = Optional.ofNullable(null);
        return studentOptional.map(Student::getName).orElse("Default");
    }


    public static String optionalOrElseGet() {
//        Optional<Student> studentOptional =
//                Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> studentOptional = Optional.ofNullable(null);
        return studentOptional.map(Student::getName).orElseGet(() -> "Default");
    }

    public static String optionalOrElseThrow() {
        Optional<Student> studentOptional =
                Optional.ofNullable(StudentDataBase.studentSupplier.get());
//        Optional<Student> studentOptional = Optional.ofNullable(null);
        return studentOptional.map(Student::getName).orElseThrow(() -> new RuntimeException("No com.learn.java.data available"));
    }

    public static void main(String[] args) {

        System.out.println("Or Else:" + optionalOrElse());
        System.out.println("Or Else Get:" + optionalOrElseGet());
        System.out.println("Or Else Throw:" + optionalOrElseThrow());
    }


}
