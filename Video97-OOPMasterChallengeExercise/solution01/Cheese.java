package com.amitsuneja;

public class Cheese {

    private boolean haveCheese;
    private double costOfCheese;

    public Cheese(boolean haveCheese) {
        this.haveCheese = haveCheese;
        this.costOfCheese =2d;
    }

    public boolean isHaveCheese() {
        return haveCheese;
    }

    public void setHaveCheese(boolean haveCheese) {
        this.haveCheese = haveCheese;
    }

    public double getCostOfCheese() {
        return costOfCheese;
    }

    public void setCostOfCheese(double costOfCheese) {
        this.costOfCheese = costOfCheese;
    }
}
