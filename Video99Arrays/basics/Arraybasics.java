package com.amitsuneja;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        // A Java array variable can also be declared like other variables with [] after the data type.
        // The variables in the array are ordered and each have an index beginning from 0.
        // The size of an array must be specified by an int value and not long or short.

        // Array can contain primitives (int, char, etc.) as well as object (or non-primitive) references
        // of a class depending on the definition of the array. In case of primitive data types, the actual
        // values are stored in contiguous memory locations. In case of objects of a class, the actual objects
        // are stored in heap segment.

        // The elements in the array allocated by new will automatically be initialized to zero
        // (for numeric types), false (for boolean), or null (for reference types)


        int intArray[];
        // or - both are valid ways of declaring array.
        int[] int_Array;


        int myArray[];    //declaring array
        intArray = new int[20];  // allocating memory to array

        int[] intArrayLiteral1 = new int[]{ 1,2,3,4,5,6,7,8,9,10 };  // Declaring array literal
        //There is no need to write the new int[] part in the latest versions of Java
        int[] intArrayLiteral2 = { 1,2,3,4,5,6,7,8,9,10 }; // is also valid

        Student[] arr = new Student[3]; //student is a user-defined class




        String[] companies;
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars.length);
        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);
        System.out.println(cars[3]);
        cars[0] = "Opel";
        for (int i=0 ; i< cars.length; i++){
            System.out.println( "car no :" + i + " is :" + cars[i]);
        }
        for (String i : cars) {
            System.out.println(i);
        }

        // multidimentional array
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        int x = myNumbers[1][2];
        System.out.println(x); // Outputs 7



        System.out.println("________________________________________________");
        int[][] twoDimentionArray = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int i=0 ; i<twoDimentionArray.length; i++ ){
            for (int j=0; j < twoDimentionArray[i].length; j++){
                System.out.println(twoDimentionArray[i][j]);
            }
        }
    }

    public class Student{

        private String nameofstudent;
        private int dateofbirth;

        public Student(String nameofstudent, int dateofbirth) {
            this.nameofstudent = nameofstudent;
            this.dateofbirth = dateofbirth;
        }
    }



}


