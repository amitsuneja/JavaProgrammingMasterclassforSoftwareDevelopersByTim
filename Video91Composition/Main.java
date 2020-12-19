package com.amitsuneja;

public class Main {

    public static void main(String[] args) {

        Dimensions dimentionsforpc = new Dimensions(14, 16, 8);
        Case casecoverforpc = new Case("small 3335", "dell","240w", dimentionsforpc);
        Monitor monitorforpc = new Monitor("bigmonitor", "samsung", 14,
                new Resulution(540, 1700));
        Motherboard motherboardforpc = new Motherboard("best", "samsung",6, 9,
                "mybios");

        Personalcomputer myPC = new Personalcomputer(casecoverforpc, monitorforpc, motherboardforpc);


        myPC.getTheCase().pressPowerButton();
        myPC.getMotherboard().loadProgram("KBC ");
        // we used getMonitor from myPC and then we called drawPixelAt from Monitor class.
        myPC.getMonitor().drawPixelAt(5,6, "green");











    }
}
