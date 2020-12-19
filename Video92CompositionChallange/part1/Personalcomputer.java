package com.amitsuneja;

public class Personalcomputer {

    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;



    public Personalcomputer(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }





    public void powerOnPc(){
        theCase.pressPowerButton(); // getTheCase().pressPowerButton()
        drawlogo();

    }

    private void drawlogo(){
        // its up to you user monior.drawPixelAt or getMonitor().drawPixelAt
       // getMonitor().drawPixelAt(4,4,"blue");
        // or
        monitor.drawPixelAt(4,4,"blue");
    }





}