package com.learn.java;

import com.learn.java.data.Student;

import java.util.Comparator;

public class ComparatorLambdaExample {


    public static void main(String[] args) {


        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        System.out.println("comparator:" + comparator.compare(1, 2));


        // new way

        Comparator<Integer> comparableTwo = (Integer a, Integer b) -> a.compareTo(b);
        Comparator<Student> comparatorA = (a,b ) -> a.getName().compareTo(b.getName());
    }

}


