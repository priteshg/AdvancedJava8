package com.learn.java.defaults;

public interface Interface2 extends Interface1 {

    default void methodB() {
        System.out.println("Method B");
    }

    default void methodA() {
        System.out.println("Method A " + Interface2.class);
    }
}
