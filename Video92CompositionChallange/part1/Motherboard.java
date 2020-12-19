package com.amitsuneja;

public class Motherboard {

    private String model;
    private String manfacturer;
    private int ramslots;
    private int cardslots;
    private String bios;





    // constructor
    public Motherboard(String model, String manfacturer, int ramslots, int cardslots, String bios) {
        this.model = model;
        this.manfacturer = manfacturer;
        this.ramslots = ramslots;
        this.cardslots = cardslots;
        this.bios = bios;
    }


    // method loadProgram
    public void loadProgram(String programname){
        System.out.println("Program : " + programname + "loading into Motherboard class");
    }













    // setters and getters
    public void setModel(String model) {
        this.model = model;
    }

    public void setManfacturer(String manfacturer) {
        this.manfacturer = manfacturer;
    }

    public void setRamslots(int ramslots) {
        this.ramslots = ramslots;
    }

    public void setCardslots(int cardslots) {
        this.cardslots = cardslots;
    }

    public void setBios(String bios) {
        this.bios = bios;
    }

    public String getModel() {
        return model;
    }

    public String getManfacturer() {
        return manfacturer;
    }

    public int getRamslots() {
        return ramslots;
    }

    public int getCardslots() {
        return cardslots;
    }

    public String getBios() {
        return bios;
    }
}