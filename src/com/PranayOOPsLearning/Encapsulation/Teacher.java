package com.PranayOOPsLearning.Encapsulation;

public class Teacher {
    public static void main(String[] args){
        Student std = new Student(101, "John");
        std.setAttendance(true);
        std.getAttendance();
    }
}
