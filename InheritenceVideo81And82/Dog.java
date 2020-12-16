package com.amitsuneja;

public class Dog extends Animals{

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;

    public Dog(String name,  int size, int eyes, int legs, int tail, int teeth) {
        super(1, name, 1, size);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
    }

    private void chew(){
        System.out.println("Only Dog class can chew while moving");
    }

    @Override
    public void move(int speed) {
        System.out.println("notice dog class is moving at speed =" + speed + "km/hr");
    }

    @Override
    public void eat() {
        System.out.println("Notice Dog is eating from Dog Class");
        super.eat();    // you can ommit super from super.eat here. what java will do .it will try to find
                        // if it has private eat() in Dog.java file , if not find it will execute eat()
                        // from Animals.java file
        chew();

    }
}
