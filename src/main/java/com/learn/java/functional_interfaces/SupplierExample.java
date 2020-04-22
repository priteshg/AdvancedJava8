package com.learn.java.functional_interfaces;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {
        Supplier<Student> studentSupplier = () -> {
            return new Student("Adam", 2, 3.6, "male", Arrays.asList("swimming", "basketball", "volleyball"), 11);
        };

        Supplier<List<Student>> listSupplier = StudentDataBase::getAllStudents;

        System.out.println("Student is : " + studentSupplier.get());
        System.out.println("Students is : " + listSupplier.get());
    }
}
