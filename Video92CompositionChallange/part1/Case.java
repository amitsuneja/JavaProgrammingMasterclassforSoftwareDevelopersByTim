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


    public String getManfacturer() {
        return manfacturer;
    }


    public String getPowersupply() {
        return powersupply;
    }


    public Dimensions getDimensions() {
        return dimensions;
    }

























}