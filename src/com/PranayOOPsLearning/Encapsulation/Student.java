package com.PranayOOPsLearning.Encapsulation;

public class Student {
    private int rollNumber;
    private String name;
    private boolean isAttended;

    public Student(int rollNumber, String name){
        this.rollNumber = rollNumber;
        this.name = name;

    }


    public void setAttendance (boolean flag) {
        if(!isAttended){
            isAttended = flag;
            System.out.println("Teacher made attendance to the student: "
                    + name +   " bearing roll no: " + rollNumber);
        }
    }
    public boolean getAttendance() {
        System.out.println("Teacher accessed student attendance");
        return isAttended;
    }
}
