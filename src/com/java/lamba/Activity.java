package com.java.lamba;

/**
 * http://www.journaldev.com/2752/java-8-interface-changes-static-method-default
 * -method
 * 
 * @Date 1:58:45 pm 23 Mar 2017
 * @author wilkins.liang
 *
 */
// Functional interfaces. An interface with exactly one abstract method is known
// as Functional Interface.
// @FunctionalInterface annotation is a facility to avoid accidental addition of
// abstract methods in the functional interfaces. It’s optional but good
// practice to use it.
//@FunctionalInterface
public interface Activity {

    public default void run(int meters) {
        System.out.println("Activity running ->" + meters);
    }

    public default void swim(int meters) {
        System.out.println("Activity swimming ->" + meters);
    }

    public void hobbit(String hobbitName);
    
    

    public static boolean shareHobbit(String hobbitName) {
        if (isNull(hobbitName)) {
            System.out.println("Activity sharing hobbit ->" + " but hobbit is null");
        } else {
            System.out.println("Activity sharing hobbit ->" + hobbitName);
        }

        return hobbitName == null ? true : "".equals(hobbitName) ? false : true;
    }

    static boolean isNull(String str) {
        System.out.println("Interface Null Check -> " + str);

        return str == null ? true : "".equals(str) ? true : false;
    }
}
