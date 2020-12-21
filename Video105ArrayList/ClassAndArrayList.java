package com.amitsuneja;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // create class Student.
        // Each student have name rollno and marks.

        // add student object to ArrayList .
        // Display Students Object present in Array List
        // Search for existing user is ArrayList
        // Create New student object and check if he is present in ArrayList
        // Write a method to search for student name in ArrayList.
        // https://www.baeldung.com/find-list-element-java read it later sometime not for now.



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
        System.out.println("______________________________________");
        // search object in ArrayList
        Student S4 = new Student(4, "test", 80);
        boolean isStudentExist = listofstudents.contains(S1);
        System.out.println(isStudentExist);
        isStudentExist = listofstudents.contains(S4);
        System.out.println(isStudentExist);

        System.out.println("______________________________________");
        // Search for attribute  in ArrayList
        boolean searchResult1 = customizedNameSearch1(listofstudents,"ramesh");
        System.out.println(searchResult1);
        searchResult1 = customizedNameSearch2(listofstudents,"Ramesh");
        System.out.println(searchResult1);
    }




    public static boolean customizedNameSearch1(ArrayList<Student> listofstudents, String stringToSearch) {
        boolean testResult = false;
        for (int i = 0; i < listofstudents.size(); i++) {
            if (stringToSearch.equals(listofstudents.get(i).getName())){
                testResult = true;
            }
        }
        return testResult;
    }

    public static boolean customizedNameSearch2(ArrayList<Student> listofstudents, String stringToSearch) {
        boolean testResult = false;
        for (Student listofstudent : listofstudents) {
            if (stringToSearch.equals(listofstudent.getName())) {
                testResult = true;
            }
        }
        return testResult;
    }

}
