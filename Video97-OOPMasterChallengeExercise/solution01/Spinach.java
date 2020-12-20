package com.amitsuneja;

public class Spinach {

    private boolean haveSpinach;
    private double costOfSpinach;

    public Spinach(boolean haveSpinach) {
        this.haveSpinach = haveSpinach;
        this.costOfSpinach =2d;
    }

    public boolean isHaveSpinach() {
        return haveSpinach;
    }

    public void setHaveSpinach(boolean haveSpinach) {
        this.haveSpinach = haveSpinach;
    }

    public double getCostOfSpinach() {
        return costOfSpinach;
    }

    public void setCostOfSpinach(double costOfSpinach) {
        this.costOfSpinach = costOfSpinach;
    }
}
