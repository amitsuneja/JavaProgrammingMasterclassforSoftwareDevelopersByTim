package com.amitsuneja;

import static com.amitsuneja.Myscanner.scanLine;
import static com.amitsuneja.Myscanner.scanbool;


public class Healthyburger extends Hamburger {
    private Cheese myCheese;
    private boolean addCheese;
    private Pineapple myPineapple;
    private boolean addPineapple;



    public Healthyburger(boolean isMeat, double priceOfBurger) {
        super("brown bread", isMeat, priceOfBurger);

    }

    @Override
    public void customizeHamBurger() {
        super.customizeHamBurger();
        System.out.println(" Would like to add some Cheese?");
        addCheese = scanbool();
        if (addCheese){
            myCheese = new Cheese(true);
        }else{
            myCheese = new Cheese(false);
        }
        scanLine();

        System.out.println(" Would like to add some Pineapple?");
        addPineapple = scanbool();
        if (addPineapple){
            myPineapple = new Pineapple(true);
        }else{
            myPineapple = new Pineapple(false);
        }
        scanLine();
    }





    @Override
    public double getTotalCost() {
        double costofhealthburger=  super.getTotalCost();
        if (myCheese.isHaveCheese()){
            System.out.println("Charged " + myCheese.getCostOfCheese() + "for Cheese" );
            costofhealthburger += myCheese.getCostOfCheese();
        }
        if (myPineapple.isHavePineapple()){
            System.out.println("Charged " + myPineapple.getCostOfPineapple() + "for Pineapple" );
            costofhealthburger += myPineapple.getCostOfPineapple();
        }
        return costofhealthburger;
    }











}
