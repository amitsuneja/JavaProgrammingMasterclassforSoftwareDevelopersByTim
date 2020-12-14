package com.amitsuneja;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        Car myFirstCar = new Car();
        Car mySecondCar = new Car();
        myFirstCar.setModel("santro");
        mySecondCar.setModel("verna");
        String modelOfFirstCar =  myFirstCar.getModel();
        String modelOfSecondCar =  mySecondCar.getModel();
        System.out.println("model of my first car is " + modelOfFirstCar + " then i purchased " + modelOfSecondCar);

    }

}
