package com.amitsuneja;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // create class Student.
        // Each student have name rollno and marks.
        // use arraylist to store Student object.
        // We have no idea , how many Students we need to add.

        ArrayList<Student> listofstudents = new ArrayList<Student>();
        Student S1 = new Student(1, "Amit", 60);
        Student S2 = new Student(2, "Sumit", 40);
        Student S3 = new Student(3, "Mala", 90);
        listofstudents.add(S1);
        listofstudents.add(S2);
        listofstudents.add(S3);
        System.out.println(listofstudents.size());
        for (int i=0; i< listofstudents.size(); i++) {
            System.out.println(listofstudents.get(i).getName());
            System.out.println(listofstudents.get(i).getMarks());
            System.out.println(listofstudents.get(i).getRollno());
        }


    }


}
