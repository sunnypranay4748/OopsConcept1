package com.PranayOOPsLearning.Polymorphism;

/*
poly: Multiple
morphism: Forms

Polymorphism is the ability of an object to take on many forms.
Polymorphism is divided into two types:
1. Compile-time Polymorphism -  can be achieved by method overloading which means having same methods
but if there is change in parameters size or type or order is called method overloading
2. Runtime Polymorphism - can be achieved by method overriding, which means if you extend a class and
changes the implementation of a method in your class then it is called method overriding

 */

public class Calculations {

    public void add(int a, int b, int c) {
        int d = a+b+c;
        System.out.println("Three parameters Addition code " + d);
    }


    public void add(int a, int b) {
        int c = a+b;
        System.out.println("Two parameters Addition code " + c);
    }

    public static void main(String[] args) {
        Calculations cal = new Calculations();
        cal.add(10, 11, 12);
        cal.add(10, 11);
    }
}
