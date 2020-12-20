package com.amitsuneja;

public class Lettuce {

    private boolean haveLettuce;
    private double costOfLettuce;

    public Lettuce(boolean haveLettuce) {
        this.haveLettuce = haveLettuce;
        this.costOfLettuce =2d;
    }


    public boolean isHaveLettuce() {
        return haveLettuce;
    }

    public void setHaveLettuce(boolean haveLettuce) {
        this.haveLettuce = haveLettuce;
    }

    public double getCostOfLettuce() {
        return costOfLettuce;
    }

    public void setCostOfLettuce(double costOfLettuce) {
        this.costOfLettuce = costOfLettuce;
    }
}
