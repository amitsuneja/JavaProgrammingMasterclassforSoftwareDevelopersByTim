package com.amitsuneja;

public class Regulator {

    private String company;
    private int currentspeed;


    public Regulator(String company, int currentspeed) {
        this.company = company;
        this.currentspeed = regulatorSpeedCheck(currentspeed);
    }


    public int regulatorSpeedCheck(int speed){
        if (speed > 5){ speed = 5; }
        if (speed < 0){ speed = 0; }
        regulatorprintfanspeed(speed);
        return speed;
    }

    public void regulatorIncreaseSpeed(int speed){
        int newspeed = currentspeed + speed;
        this.currentspeed = regulatorSpeedCheck(newspeed);
    }

    public void regulatordescreaseSpeed(int speed){
        int newspeed = currentspeed - speed;
        this.currentspeed = regulatorSpeedCheck(newspeed);
    }

    private void regulatorprintfanspeed(int speed){
        System.out.println("requlated speed =" + speed);
    }

    public int  getCurrentspeedofregulator(){
        return getCurrentspeed();
    }

    private int getCurrentspeed() {
        return currentspeed;
    }
}
