package com.amitsuneja;
// Create a program using arrays that sorts a list of integers in descending order.
// Descending order is highest value to lowest.
// In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
// ultimately have an array with 106,81,26, 15, 5 in it.
// Set up the program so that the numbers to sort are read in from the keyboard.
// Implement the following methods - getIntegers, printArray, and sortIntegers
// getIntegers returns an array of entered integers from keyboard
// printArray prints out the contents of the array
// and sortIntegers should sort the array and return a new array containing the sorted numbers
// you will have to figure out how to copy the array elements from the passed array into a new
// array and sort them and return the new sorted array.


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {

        int[] thisarray = getInts();
        int[] newarray = sortIntegersmanually(thisarray);
        printArray(newarray);
    }

    public static void printArray(int[] myarrayofints){

        for (int i=0; i< myarrayofints.length ; i++){
            System.out.println("Value of Element no " + i + " in array=" + myarrayofints[i]);
        }
    }

    public static int[] sortIntegersmanually(int[] myarrayofints){

        for(int i=0; i< myarrayofints.length; i++){
            for(int j=0; j< myarrayofints.length; j++){
                int temp =0;
                if (myarrayofints[i] < myarrayofints[j])
                {
                    temp = myarrayofints[i];
                    myarrayofints[i] = myarrayofints[j];
                    myarrayofints[j] = temp;
                }
            }
        }
        return myarrayofints;

    }

    public static int[] sortIntegers(int[] myarrayofints){

        Arrays.sort(myarrayofints);
        return myarrayofints;
    }


    public static int[] getInts(){

        int[] myarrayofints = new int[5];
        for (int i=0; i < myarrayofints.length; i++){
            System.out.println("Please Enter Number to append to array:");
            myarrayofints[i] = myScanner.nextInt();
            myScanner.nextLine();
        }
        return myarrayofints;
    }
    
}



