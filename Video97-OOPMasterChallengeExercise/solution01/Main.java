package com.amitsuneja;

public class Main {

    public static void main(String[] args) {

        System.out.println("----preparing simple Hamburger------");
        Hamburger B1 = new Hamburger("white ", true , 10d);
        B1.customizeHamBurger();
        System.out.println("Total =" +B1.getTotalCost());

        System.out.println("-----preparing Healthy-burger-----");
        Healthyburger B2 = new Healthyburger(true, 20d);
        B2.customizeHamBurger();
        System.out.println("Total =" +B2.getTotalCost());


        System.out.println("-----preparing Deluxe-burger-----");
        Deluxehamburger B3 = new Deluxehamburger( 5d);
        B3.customizeHamBurger();
        System.out.println("Total =" +B3.getTotalCost());


    }
}
