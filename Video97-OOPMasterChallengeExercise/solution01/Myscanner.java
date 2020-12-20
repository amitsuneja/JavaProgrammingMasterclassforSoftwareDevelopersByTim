package com.amitsuneja;
import java.util.Scanner;


public class Myscanner {
    static Scanner thisStaticScanner = new Scanner(System.in);
    public static String scanLine(){
        return thisStaticScanner.nextLine();
    }
    public static boolean scanbool(){
        return thisStaticScanner.nextBoolean();
    }
}
