package com.amitsuneja;

public class Hamburger {
    private String breadRollType;
    private boolean isMeat;
    private Lettuce haveLettuce;
    private double basePrice;

    public Hamburger(String breadRollType, boolean isMeat, Lettuce haveLettuce) {
        this.breadRollType = breadRollType;
        this.isMeat = isMeat;
        this.haveLettuce = haveLettuce;
    }

    public void calculateTotalCostOfBurger() {
        this.basePrice = 2.0D;
        double totalPrice = this.basePrice;
        System.out.println("Base Price = " + this.basePrice);
        if (this.haveLettuce.isLettuce()) {
            totalPrice = this.basePrice + this.haveLettuce.getPriceOfLettuce();
            System.out.println("Addition of Lettuce=" + this.haveLettuce.getPriceOfLettuce());
        }

        System.out.println("total Cost =" + totalPrice);
    }
}
