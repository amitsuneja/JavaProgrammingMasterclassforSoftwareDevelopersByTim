package com.amitsuneja;

public class Drinks {


    private boolean haveDrinks;
    private double costOfDrinks;

    public Drinks(boolean haveDrinks) {
        this.haveDrinks = haveDrinks;
        this.costOfDrinks = 1d;
    }





    public boolean isHaveDrinks() {
        return haveDrinks;
    }

    public void setHaveDrinks(boolean haveDrinks) {
        this.haveDrinks = haveDrinks;
    }

    public double getCostOfDrinks() {
        return costOfDrinks;
    }

    public void setCostOfDrinks(double costOfDrinks) {
        this.costOfDrinks = costOfDrinks;
    }




}


