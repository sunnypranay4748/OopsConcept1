package com.PranayOOPsLearning.AbstractClass;

/*
Abstract class can be used for two ways:
1. using with interfaces: If we don't know or don't want to implement all the methods of interface
then we can use Abstract class to achieve it.
2. using on its own: You can create an Abstract class of its own with some implementation methods that you
assume will be same for any no.of classes and some abstract methods/empty methods that must present,
but implementation can be left to class itself that extends abstract class. this will improve the code
reusability of common code. You can always override the implementation of method by using @Override

Notes:
1. We can have some additional methods if needed without implementation, but unlike in interface
this empty/non-implemented methods must be declared with abstract keyword. This methods can be some
leftover same methods from interface or new methods
2. We cannot create instances for abstract class, since abstract class may have um-implemented methods
3. We can have non-abstract methods inside abstract class like first two methods,
that is the sole purpose of abstract class
4. Abstract class can only be extended, not implemented like interfaces.
 */

public abstract class LaptopMethods implements Laptop {
    public void copy() {
        System.out.println("Laptop copy code");
    }

    public void paste() {
        System.out.println("Laptop paste code");
    }

    //You can some extra abstract methods if needed

//    public abstract void cut();
//
//    public abstract void keyBoard();
}
