package com.amitsuneja;

public class Carrot {

    private boolean haveCarrot;
    private double costOfCarrot;

    public Carrot(boolean haveCarrot) {
        this.haveCarrot = haveCarrot;
        this.costOfCarrot =2d;
    }

    public boolean isHaveCarrot() {
        return haveCarrot;
    }

    public void setHaveCarrot(boolean haveCarrot) {
        this.haveCarrot = haveCarrot;
    }

    public double getCostOfCarrot() {
        return costOfCarrot;
    }

    public void setCostOfCarrot(double costOfCarrot) {
        this.costOfCarrot = costOfCarrot;
    }
}
