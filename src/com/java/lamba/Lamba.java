package com.java.lamba;

public class Lamba {
    
    

    @FunctionalInterface
    interface Foo {
        int m();

//        Object clone();
        String toString();
    }

    @FunctionalInterface
    public interface Activity {

        public int defaultLegs = 4;

        public void run(int meters);

        default public void eat(String food) {
            System.out.println("im eating this -> " + food);
        }

        // If any class in the hierarchy has a method with same signature, then
        // default methods become irrelevant.
        default public void sleep(int hours) {
            System.out.println("im sleep this time for-> " + hours);
        }

        default public void getLegs() {
            System.out.println("im need -> " + defaultLegs + " legs");
        }

        // Java interface static method is similar to default method except that
        // we can’t override them in the implementation classes. This feature
        // helps us in avoiding undesired results incase of poor implementation
        // in implementation classes.
        static boolean healthStatus(boolean health) {
            System.out.println("Health Status from Activity ->" + health);
            return health == true ? true : false;
        }
    }

    public class Animal implements Activity {

        @Override
        public void run(int meters) {
            // TODO Auto-generated method stub
            System.out.println("Animal had run ->" + meters);
        }

        public void sleep(int hours) {
            System.out.println("Animal sleep this time for-> " + hours);
        }

        public boolean healthStatus(boolean health) {
            System.out.println("Health Status from Animal ->" + health);
            return false;
        }

    }

    public static void main(String args[]) {
        Activity a = meters -> {
            System.out.println("This Activity had run ->" + meters);
        };

        a.run(15);
        a.getLegs();

        Animal an = new Lamba().new Animal();
        an.run(50);
        an.healthStatus(true);

    }

}
