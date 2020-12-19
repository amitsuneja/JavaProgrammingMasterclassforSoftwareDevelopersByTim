package com.amitsuneja;

public class TubeLight {

    private String company;
    private String watt;
    private ElectricalSwitch tubeswitch;

    public TubeLight(String company, String watt, ElectricalSwitch tubeswitch) {
        this.company = company;
        this.watt = watt;
        this.tubeswitch = tubeswitch;
    }

    public void tubeStart(){
        System.out.println("switching on tubelight");
        tubeswitch.toggleSwitchOn();
    }

    public void tubelightStop(){
        System.out.println("switching off tubelight");
        tubeswitch.toggleSwitchoff();
    }




}
