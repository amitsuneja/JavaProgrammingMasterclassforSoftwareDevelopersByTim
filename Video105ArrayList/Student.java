package com.amitsuneja;

public class Student {

    private int rollno;
    private String name;
    private int marks;


    public Student(int rollno, String name, int marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }


    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }
}
