package com.amitsuneja;

public class Main {

    /*
    This solution is ok in-fact better from OOPS concepts , but we need to follow the challange that we can only
    pass 3 parameters to constructor , hence we are re-writing this code .
    But we are keeping it for reference.
     */

    public static void main(String[] args) {
        com.amitsuneja.Lettuce mylecttue = new com.amitsuneja.Lettuce(true);
        com.amitsuneja.Hamburger myburger = new com.amitsuneja.Hamburger("bunn", false, mylecttue);
        myburger.calculateTotalCostOfBurger();
    }
}
