package com.amitsuneja;

import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {

        Customer cumstomer01 = new Customer("amit" , 100);
        Customer cumstomer02 ;
        cumstomer02 = cumstomer01;
        cumstomer02.setBalance(50000);
        System.out.println("Notice balance for cumstomer01 is changed where as i tried to change for customer02= " + cumstomer01.getBalance());
        System.out.println("_________________________________________");
        ArrayList<Double> mydoublelist = new ArrayList<Double>();
        for(double i=0; i< 5; i++){
            mydoublelist.add(i+1);
        }
        for(double i=0; i< 5; i++){
            System.out.println(i + ". -> " +mydoublelist.get((int)i));
        }
        // all items below index 1 meed to be moved , this will be slow when u have billions of items.
        // solution to this is LinkedList.
        mydoublelist.add(1, 8d);
        for(double i=0; i< 5; i++){
            System.out.println(i + ". -> " +mydoublelist.get((int)i));
        }




    }// main method ends here


} // Main class End here
