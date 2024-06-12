package com.PranayOOPsLearning.Inheritance;

public class Admin extends  Developer{

    public void manage() {
        super.read();
        write();
        System.out.println("Manage Code");
    }

    /*
    Though you inherit the read() method from parent class(Developer which inherits Guest),
     Admin class use read method present in its class. Basically when you have a method with
     Same name in parent and child classes, the method that present in child class is used first.
     Example: Similarly, when you declare a variable inside a method is used  instead a variable
     declared as instance variable level.
     In-order to use the parent class methods or properties or behaviours specifically we need
     to use the super keyword
     */
    public void read(){
        System.out.println("Admin Read Access");
    }
}
