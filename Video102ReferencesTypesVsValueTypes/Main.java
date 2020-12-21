package com.amitsuneja;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int myIntValue = 10;
        int anotherIntValue = myIntValue; // simple variable value is directly assigned to variable. (Not refrence)

        System.out.println("myIntValue = " + myIntValue); // 10
        System.out.println("anotherIntValue = " + anotherIntValue); //10

        anotherIntValue++;

        System.out.println("myIntValue = " + myIntValue); //10
        System.out.println("anotherIntValue = " + anotherIntValue); //

        System.out.println("_______________________________________");


        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray; // Array , classs where you use word new , in hose cases value is not assigned
                                         // directly rather refrence is assigned

        System.out.println("myIntArray= " + Arrays.toString(myIntArray)); // myIntArray= [0, 0, 0, 0, 0]
        System.out.println("anotherArray= " + Arrays.toString(anotherArray)); // anotherArray= [0, 0, 0, 0, 0]

        anotherArray[0] = 1;

        System.out.println("after change myIntArray= " + Arrays.toString(myIntArray));
        System.out.println("after change anotherArray= " + Arrays.toString(anotherArray));
        // after change myIntArray= [1, 0, 0, 0, 0]  --> auto modified coz again reference thing.
        //after change anotherArray= [1, 0, 0, 0, 0]

        int[] amit = {4, 5, 6, 7, 8};
        System.out.println("amit =" + Arrays.toString(amit)); //amit =[4, 5, 6, 7, 8]
        System.out.println("_______________________________________");

        // anotherArray = {4, 5, 6, 7, 8}; // see error "Array initializer is not allowed here"
        anotherArray = new int[]{4, 5, 6, 7, 8}; // deleted the reference and created new array
        modifyArray(myIntArray);
        System.out.println("after modify myIntArray= " + Arrays.toString(myIntArray));
        System.out.println("after modify anotherArray= " + Arrays.toString(anotherArray));
    }

    private static void modifyArray(int[] array) {

        array[0] = 2; // see this method is void , still this change value of reference from main method.
        array = new int[] {1, 2, 3, 4, 5};
    }
}



/*
myIntValue = 10
anotherIntValue = 10
myIntValue = 10
anotherIntValue = 11
_______________________________________
myIntArray= [0, 0, 0, 0, 0]
anotherArray= [0, 0, 0, 0, 0]
after change myIntArray= [1, 0, 0, 0, 0]
after change anotherArray= [1, 0, 0, 0, 0]
amit =[4, 5, 6, 7, 8]
_______________________________________
after modify myIntArray= [2, 0, 0, 0, 0]
after modify anotherArray= [4, 5, 6, 7, 8]

Process finished with exit code 0
 */
