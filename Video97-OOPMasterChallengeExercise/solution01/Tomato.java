package com.amitsuneja;

public class Tomato {

    private boolean haveTomato;
    private double costOfTomato;

    public Tomato(boolean haveTomato) {
        this.haveTomato = haveTomato;
        this.costOfTomato =2d;
    }

    public boolean isHaveTomato() {
        return haveTomato;
    }

    public void setHaveTomato(boolean haveTomato) {
        this.haveTomato = haveTomato;
    }

    public double getCostOfTomato() {
        return costOfTomato;
    }

    public void setCostOfTomato(double costOfTomato) {
        this.costOfTomato = costOfTomato;
    }
}
