package com.amitsuneja;

public class Main {

    public static void main(String[] args) {

        // Create a single room of a house using composition.
        // Think about the things that should be included in the room.
        // Maybe physical parts of the house but furniture as well
        // Add at least one method to access an object via a getter and
        // then that objects public method as you saw in the previous video
        // then add at least one method to hide the object e.g. not using a getter
        // but to access the object used in composition within the main class
        // like you saw in this video.



        ElectricalSwitch S1fortube = new ElectricalSwitch(false);
        TubeLight tubeforbedroom = new TubeLight("wipro", "240", S1fortube);

        ElectricalSwitch S2forfan = new ElectricalSwitch(false);
        Regulator regulatorforfan = new Regulator("wipro", 3);
        Fan fan1 = new Fan("wipro", "dell", S2forfan, regulatorforfan);

        Room bedroom = new Room("1", tubeforbedroom, fan1);
        fan1.startFan();
        regulatorforfan.regulatorIncreaseSpeed(5);
        regulatorforfan.regulatorSpeedCheck(10);
        tubeforbedroom.tubeStart();
        System.out.println("Night Start in the room");
        fan1.stopFan();
        tubeforbedroom.tubelightStop();






    }
}