package com.amitsuneja;

public class ElectricalSwitch {

    private boolean stateofelectricalswitch;

    public ElectricalSwitch(boolean stateofelectricalswitch) {
        this.stateofelectricalswitch = false;
    }



    public void toggleSwitchOn(){ powerOnSwitch(); }
    public void toggleSwitchoff(){ poweroffSwitch(); }



    private void powerOnSwitch() {
        /* this method is to toggle switch to on state */
        if (!this.stateofelectricalswitch) {
            this.stateofelectricalswitch = true;
            System.out.println("Switch is in powered-on state now");
        } else {
            System.out.println("switch is already powered on");
        }

    }

    private void poweroffSwitch() {
        /* this method is to toggle switch to off state */
        if (this.stateofelectricalswitch) {
            this.stateofelectricalswitch = false;
            System.out.println("Switch is in powered-off state now");
        } else {
            System.out.println("switch is already powered off");
        }





    }
}




