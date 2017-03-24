package com.java.generic;

//java Generics Type Erasure
//
//Generics in Java was added to provide type-checking at compile time and it has no use at run time,
//so java compiler uses type erasure feature to remove all the generics type checking code in byte 
//code and insert type-casting if necessary. Type erasure ensures that no new classes are created for parameterized types;
//        consequently, generics incur no runtime overhead.
////
//For example if we have a generic class like below;
public class Test<T extends Comparable<T>> {
    private T data;
    private Test<T> next;

    public Test(T d, Test<T> n) {
        this.data = d;
        this.next = n;
    }

    public T getData() {
        return this.data;
    }
}
