package com.java.generic;

public class GenericsInheritance {
    public static void main(String[] args) {
        String str = "abc";
        Object obj = new Object();
        obj = str; // works because String is-a Object, inheritance in java

        MyClass<String> myClass1 = new MyClass<>();
        MyClass<Object> myClass2 = new MyClass<>();

        // myClass2 = myClass1;// compilation error since MyClass<String> is not
        // a MyClass<Object>
        obj = myClass1;// MyClass<T> parent is Object

        // Java Generic Classes and Subtyping
        //
        // We can subtype a generic class or interface by extending or
        // implementing it. The relationship between the type parameters of one
        // class or interface and the type parameters of another are determined
        // by the extends and implements clauses.
        //
        // For example, ArrayList<E> implements List<E> that extends
        // Collection<E>, so ArrayList<String> is a subtype of List<String> and
        // List<String> is subtype of Collection<String>.
        //
        // The subtyping relationship is preserved as long as we don’t change
        // the type argument, below shows an example of multiple type
        // parameters.
        //
        // interface MyList<E,T> extends List<E>{
        // }
        // The subtypes of List<String> can be MyList<String,Object>,
        // MyList<String,Integer> and so on.

        // Question mark (?) is the wildcard in generics and represent an
        // unknown type. The wildcard can be used as the type of a parameter,
        // field, or local variable and sometimes as a return type. We can’t use
        // wildcards while invoking a generic method or instantiating a generic
        // class.

    }

    public static class MyClass<T> {

    }
}
