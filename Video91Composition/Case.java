package com.amitsuneja;

public class Case {


    private String model;
    private String manfacturer;
    private String powersupply;
    private Dimensions dimensions;



    public Case(String model, String manfacturer, String powersupply, Dimensions dimensions) {
        this.model = model;
        this.manfacturer = manfacturer;
        this.powersupply = powersupply;
        this.dimensions = dimensions;
    }

    public void pressPowerButton(){
        System.out.println("Power button pressed for Case Class");
    }










    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManfacturer() {
        return manfacturer;
    }

    public void setManfacturer(String manfacturer) {
        this.manfacturer = manfacturer;
    }

    public String getPowersupply() {
        return powersupply;
    }

    public void setPowersupply(String powersupply) {
        this.powersupply = powersupply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }


























}
