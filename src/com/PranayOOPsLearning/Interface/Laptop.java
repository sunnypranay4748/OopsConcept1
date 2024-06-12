package com.PranayOOPsLearning.Interface;

/*
An interface is an bluePrint of a class with set of mandatory rules/method that should be
implemented in implementation classes
 */

/*
By default every method is public if no access modifier is defined,
if no access modifier defined then the  method is public default.
if access modifier is defined as abstract method then it also treated as public abstract.
if access modifier is defined as static method then it also treated as public static.

By default non implementation methods in interface are abstract

An abstract method is that doesn't have any implementation it.
 */

public interface Laptop {

//    public or abstract methods should not have any implementation in it, the class that implements the
//    interface should have the implementation for the public or abstract methods
    abstract void copy();

    public abstract void paste();

    public void cut();

    public void keyBoard();


    // if access modifier "default" is placed for methods then those methods can have implementation in it
    // in interfaces, implementation classes of the interface may or may not  have the "default" method in their
    // class with public access modifier, but @Override annotation is required if the class needs any modification to the "default" method in it.
    // "default" methods Provides a default implementation that can be used as-is or overridden
    // by implementing classes. default methods Allows extending interfaces with new methods without
    // breaking existing implementations. Can be called on instances of implementing classes.
    default void security() {
        commonCode();
        System.out.println("Please implement");
    }

//    Belong to the interface itself, not to any instance.
//    Cannot be overridden by implementing classes.
//    Useful for utility functions related to the interface.
    static void audio(){
        commonCode();
        System.out.println("Laptop audio code");
    }

    //We can also use private access modifier with in the interface on methods for code
    // re-use ability with in the interface
    private static void commonCode() {
        System.out.println("Common Code");
    }
}
