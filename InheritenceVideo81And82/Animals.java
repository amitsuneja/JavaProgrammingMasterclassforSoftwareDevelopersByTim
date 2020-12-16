package com.amitsuneja;

public class Animals {

    private int weight;
    private String name;
    private int body;
    private int size;


    public Animals(int weight, String name, int body, int size) {
        this.weight = weight;
        this.name = name;
        this.body = body;
        this.size = size;
    }


    public Animals(int size) {
        this( 1, "name_of_animal", 1, size);
    }

    public Animals() {
        this( 1, "name_of_animal", 1, 1);
    }


    public void display(){
        System.out.println("weight of animal =" + getWeight());
        System.out.println("name of animal =" + getName());
        System.out.println("body of animal =" + getBody());
        System.out.println("size of animal =" + getSize());
    }

    public void eat() { // if you don't want Dog child class to access this method() then make it private
                        // then it wont be accessible via child class.
        System.out.println("Animal is eating");
    }

    public void move(int speed) {
        System.out.println("Animal is moving from Animal Class = " + speed + "km/hour");
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }
}
