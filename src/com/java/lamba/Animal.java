package com.java.lamba;

public class Animal implements Activity {

    @Override
    public void hobbit(String hobbitName) {
        System.out.println("Animal has hobbit ->" + hobbitName);
    }

    public void run(int meters) {
        System.out.println("Animal running for ->" + meters);
    }

    public boolean shareHobbit(String hobbitName) {
        System.out.println("Animal sharing hobbit ->" + hobbitName);
        return hobbitName == null ? true : "".equals(hobbitName) ? false : true;
    }
    
    public boolean isNull(String str) {
        System.out.println("Impl Null Check -> " + str);

        return str == null ? true : false;
    }
    
    
}
