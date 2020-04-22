package com.learn.java.functional_interfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    static UnaryOperator<String> unaryOperator = (s) -> s.concat("Default");

    public static void main(String[] args) {
        System.out.println(unaryOperator.apply("Java8"));
    }
}
