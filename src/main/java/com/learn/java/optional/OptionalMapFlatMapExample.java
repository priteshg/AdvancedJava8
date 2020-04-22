package com.learn.java.optional;

import com.learn.java.data.Bike;
import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.Optional;

public class OptionalMapFlatMapExample {

    //filter
    public static void optionalFilter() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        studentOptional.filter(student -> student.getGpa() >= 3.8)
                .ifPresent(System.out::println);
    }

    //map
    public static void optionalMap() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());

        if (studentOptional.isPresent()) {
            Optional<String> optionalString = studentOptional
                    .filter(student -> student.getGpa() >= 3.5)
                    .map(Student::getName);
            System.out.println("OptionalMap: " + optionalString.get());
        }
    }

    public static void OptionalFlatMap() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());

        Optional<String> bikeName = studentOptional
                .filter(student -> student.getGpa() >= 3.5) //Optional<Student <Optional<Bike>>
                .flatMap(Student::getBike) //returns -> Optional<Bike>
                .map(Bike::getName); //Optional<String>

        bikeName.ifPresent(System.out::println);
    }

    public static void main(String[] args) {
        optionalFilter();
        optionalMap();
        OptionalFlatMap();
    }
}
