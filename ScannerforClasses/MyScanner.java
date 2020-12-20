package com.amitsuneja;

import java.util.Scanner;


public class MyScanner {

    static Scanner scan = new Scanner(System.in);

    public static String scanLine(){
        return scan.nextLine();
    }

    public static boolean scanbool(){
        return scan.nextBoolean();
    }
}
