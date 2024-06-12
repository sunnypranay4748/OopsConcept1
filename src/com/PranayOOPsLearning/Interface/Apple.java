package com.PranayOOPsLearning.Interface;

public class Apple implements Laptop {
    public void copy() {
        System.out.println("Apple copy code");
    }

    public void paste() {
        System.out.println("Apple paste code");
    }

    public void cut() {
        System.out.println("Apple cut code");
    }

    public void keyBoard() {
        System.out.println("Apple KeyBoard code");
    }

    @Override
    public void security(){
        System.out.println("Apple security code");
    }
}
