package com.amitsuneja;

public class Deluxehamburger extends Hamburger{

    private Chips myChips;
    private boolean addChips;
    private Drinks myDrinks;
    private boolean addDrinks;


    private double priceOfBurger;

    public Deluxehamburger(double priceOfBurger) {
        super("white bread", false, priceOfBurger);
    }

    @Override
    public void customizeHamBurger() {
        myChips = new Chips(true);
        myDrinks = new Drinks(true);
    }

    @Override
    public double getTotalCost() {
        double priceOfDeluxeBurger = super.getTotalCost();
        priceOfDeluxeBurger += myDrinks.getCostOfDrinks();
        System.out.println("Charged " + myDrinks.getCostOfDrinks() + "for drinks " );
        priceOfDeluxeBurger += myChips.getCostOfChips();
        System.out.println("Charged " + myChips.getCostOfChips() + "for chips" );
        return priceOfDeluxeBurger;
    }



    private double getPriceOfBurger() {
        System.out.println("priceOfBurger =" + priceOfBurger);
        return priceOfBurger;
    }


}



