package com.learn.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.lang.String.format;

public class SumOfHundred {

    public static void sum() {
        int sum = 0;
        for (int i = 1; i < 101; i++) {
            sum += i;
        }
        System.out.println(sum);


        //better way
        int sum1 = IntStream.rangeClosed(0, 100).sum();
        System.out.println(format("sum %S", sum1));

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 5, 5, 6, 6, 6, 7);

        List<Integer> distinct = list.stream()
                .distinct()
                .collect(Collectors.toList());

        for (Integer val : distinct) {
            System.out.println(val);
        }
    }

    public static void main(String[] args) {
        sum();
    }
}
