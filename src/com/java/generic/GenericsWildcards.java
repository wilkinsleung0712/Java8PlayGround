package com.java.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericsWildcards {

    public static double sum(List<? extends Number> list) {
        return list.stream().mapToDouble(i -> i.doubleValue()).sum();
    }

    // Java Generics Lower bounded Wildcard
    //
    // Suppose we want to add Integers to a list of integers in a method, we can
    // keep the argument type as List<Integer> but it will be tied up with
    // Integers whereas List<Number> and List<Object> can also hold integers, so
    // we can use lower bound wildcard to achieve this. We use generics wildcard
    // (?) with super keyword and lower bound class to achieve this.
    //
    // We can pass lower bound or any super type of lower bound as an argument
    // in this case, java compiler allows to add lower bound object types to the
    // list.

    public static void addIntegers(List<? super Integer> list) {
        list.add(new Integer(50));
    }

    public static void main(String args[]) {
        List<Integer> ints = new ArrayList<>();
        ints.add(3);
        ints.add(5);
        ints.add(10);
        System.out.println(GenericsWildcards.sum(ints));

        // Subtyping using Generics Wildcard

        List<? extends Integer> intList = new ArrayList<>();
        List<? extends Number> numList = intList; // OK. List<? extends Integer>
                                                  // is a subtype of List<?
                                                  // extends Number>
        
        
    }
}
