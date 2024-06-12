package com.PranayOOPsLearning.Interface;

public class User {
    public static void main(String[] args){
        Lenovo lenovo = new Lenovo();
        lenovo.copy();
        lenovo.cut();
        lenovo.capture();

        Hp hp = new Hp();
        hp.printing();
        hp.keyBoard();
        hp.security();

        Apple apple = new Apple();
        apple.security();
        apple.paste();

        //For static methods in interface  we can directly call the method using class
        // reference without creating an object
        Laptop.audio();
    }
}
