package com.amitsuneja;

public class Fan {

    private String model;
    private String manfacturer;
    private ElectricalSwitch switchoffan;
    private Regulator fanregulator;


    public Fan(String model, String manfacturer, ElectricalSwitch switchoffan, Regulator fanregulator) {
        this.model = model;
        this.manfacturer = manfacturer;
        this.switchoffan = switchoffan;
        this.fanregulator = fanregulator;

    }


    public void startFan(){
        switchoffan.toggleSwitchOn();
        fanregulator.regulatorSpeedCheck(fanregulator.getCurrentspeedofregulator());
        System.out.println("fan is on");
    }

    public void stopFan(){
        switchoffan.toggleSwitchoff();
        fanregulator.regulatordescreaseSpeed(5);
        System.out.println("fan is off");
    }




}
