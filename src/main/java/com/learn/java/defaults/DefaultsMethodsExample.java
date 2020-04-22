package com.learn.java.defaults;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DefaultsMethodsExample {

    public static void main(String[] args) {
        /**
         * Sort the list names in alphabetical order
         */

        List<String> stringList = Arrays.asList("Adam", "Jenny", "Alex", "Dan", "Mike", "Eric");

        /**
         * Prior Java8
         */

        Collections.sort(stringList);
        System.out.println("Sorted List using Collections.sort() :" + stringList);

        /**
         * Java 8 approach
         */

        stringList.sort(Comparator.naturalOrder());
        System.out.println("Sorted List using List.Sort() :" + stringList);


        stringList.sort(Comparator.reverseOrder());

        System.out.println("Sorted List using List.Sort() reverse :" + stringList);
    }
}
