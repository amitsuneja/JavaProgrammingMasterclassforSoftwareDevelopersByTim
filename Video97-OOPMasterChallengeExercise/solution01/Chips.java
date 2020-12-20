package com.amitsuneja;

public class Chips {

    private boolean haveChips;
    private double costOfChips;

    public Chips(boolean haveChips) {
        this.haveChips = haveChips;
        this.costOfChips = 1d;
    }





    public boolean isHaveChips() {
        return haveChips;
    }

    public void setHaveChips(boolean haveChips) {
        this.haveChips = haveChips;
    }

    public double getCostOfChips() {
        return costOfChips;
    }

    public void setCostOfChips(double costOfChips) {
        this.costOfChips = costOfChips;
    }


}
