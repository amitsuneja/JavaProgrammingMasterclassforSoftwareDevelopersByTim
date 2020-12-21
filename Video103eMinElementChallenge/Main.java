package com.amitsuneja;

import java.util.Scanner;

public class Main {

    private static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Please let me know the number of digits you want to enter:");
        int lenghtOfArray = myScanner.nextInt();
        myScanner.nextLine();
        int[] myArray = readIntegers(lenghtOfArray);
        int minimumNumberFromArray = findMin(myArray);
        System.out.println("Minimum Number: " + minimumNumberFromArray);

    }

    public static int[] readIntegers(int lenghtOfArray){
        int[] myArray = new int[lenghtOfArray];
        for (int i = 0; i < myArray.length ; i++){
            System.out.println("Please Enter number to append to Array:");
            myArray[i] = myScanner.nextInt();
            myScanner.nextLine();
        }
        return myArray;
    }

    public static int findMin(int[] myArray) {
        int temp = Integer.MAX_VALUE;
        for (int i = 0; i < myArray.length; i++) {
            if ( temp > myArray[i] ){
                temp = myArray[i];
            }
        }
        return temp;
    }
}