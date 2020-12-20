package com.amitsuneja;

public class Pineapple {

    private boolean havePineapple;
    private double costOfPineapple;

    public Pineapple(boolean havePineapple) {
        this.havePineapple = havePineapple;
        this.costOfPineapple =2d;
    }

    public boolean isHavePineapple() {
        return havePineapple;
    }

    public void setHavePineapple(boolean havePineapple) {
        this.havePineapple = havePineapple;
    }

    public double getCostOfPineapple() {
        return costOfPineapple;
    }

    public void setCostOfPineapple(double costOfPineapple) {
        this.costOfPineapple = costOfPineapple;
    }
}
