package com.java.lamba;

public class LambaTestMain {

    public static void main(String args[]) {
        
        Activity activity = hobbit -> {
            System.out.println("Activity hobbit is ->" + hobbit);
        };
        
        Animal a1 = new Animal();
        a1.hobbit("Animal Activity");
        a1.run(15);
        
        //Activity running ->10
        activity.run(10);
        
        //Activity swimming ->200
        a1.swim(200);
        
        a1.shareHobbit("joking");
        
        
        Activity.isNull("omg");
        a1.isNull("joking");
    }
}
