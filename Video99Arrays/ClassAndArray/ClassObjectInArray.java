package com.amitsuneja;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Write a small code -
        // create class Student. Remember every student has first name("String" type) and Roll No("String" type)
        // you need to create constructor , getter and setter method for Student class.
        // variables in class are private

        // you have 3 students in class , hence Array[3])

        // write method which will prompt for name and roll number of all 3 students.(later we will talk about ArrayList)

        // write method which will print name and roll number of all 3 students.

        Scanner myScanner = new Scanner(System.in);
        Student[] arrayofstudents = new Student[3];

        for (int i=0; i < arrayofstudents.length; i++){
            System.out.println("-----NEXT------");
            System.out.println("Enter Name of Student: ");
            String name = myScanner.nextLine();
            System.out.println("Enter RollNo: ");
            int rollno = myScanner.nextInt();
            myScanner.nextLine();
            arrayofstudents[i] = new Student(name, rollno);
        }
        myScanner.close();

        for (int i=0; i < arrayofstudents.length; i++){
            System.out.println(arrayofstudents[i].getNameofstudent() +" "+ arrayofstudents[i].getRollnumber());
        }
    }
}


