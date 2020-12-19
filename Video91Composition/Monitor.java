package com.amitsuneja;

public class Monitor {

    private String model;
    private String manfacturer;
    private int size;
    private Resulution nativeResolution;





    public Monitor(String model, String manfacturer, int size, Resulution nativeResolution) {
        this.model = model;
        this.manfacturer = manfacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }






    public void drawPixelAt(int x, int y, String color){
        System.out.println("Drawing pixel at " + x + "," + y + "in color " + color + "by monitor class");
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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Resulution getNativeResolution() {
        return nativeResolution;
    }

    public void setNativeResolution(Resulution nativeResolution) {
        this.nativeResolution = nativeResolution;
    }
}
