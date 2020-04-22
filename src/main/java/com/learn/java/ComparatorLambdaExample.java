package com.learn.java;

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
    }

}


