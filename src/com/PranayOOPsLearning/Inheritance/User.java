package com.PranayOOPsLearning.Inheritance;

/*
Inheritance is a mechanism in which one class acquires all the properties and behaviours of
        another class with a specific relationship

        Extends Keywords is used to inherit a class

Java only supports multilevel-inheritance, it doesn't support multiple-inheritance
Which means ClassA Extends ClassB and ClassC extends Class B, which means
class A properties and behaviours can be inherited in class c this is multilevel- inheritance
 */

public class User {
    public static void main(String[] args){
        Guest guestObj = new Guest();
        guestObj.read();


        Developer developerObj = new Developer();
        developerObj.read();
        developerObj.write();

        Admin adminObj = new Admin();
        adminObj.read();
        adminObj.write();
        adminObj.manage();



    }
}
