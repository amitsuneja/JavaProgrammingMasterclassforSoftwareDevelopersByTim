
package com.amitsuneja;

public class Lettuce {
    private boolean isLettuce;
    private double priceOfLettuce = 1.0D;

    public Lettuce(boolean isLettuce) {
        this.isLettuce = isLettuce;
    }

    public boolean isLettuce() {
        return this.isLettuce;
    }

    public void setLettuce(boolean lettuce) {
        this.isLettuce = lettuce;
    }

    public double getPriceOfLettuce() {
        return this.priceOfLettuce;
    }

    public void setPriceOfLettuce(double priceOfLettuce) {
        this.priceOfLettuce = priceOfLettuce;
    }
}
