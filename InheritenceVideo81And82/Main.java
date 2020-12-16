package com.amitsuneja;

public class Main {

    public static void main(String[] args){

        Animals firstCommonAnimal = new Animals();
        Animals secondCommonAnimal = new Animals(5);
        Dog firstDog = new Dog("bolt", 8, 2,4,1,32);

        System.out.println("_______________________________________________");
        firstCommonAnimal.display();
        System.out.println("_______________________________________________");
        secondCommonAnimal.display();
        System.out.println("_______________________________________________");
        firstDog.display();
        System.out.println("_______________________________________________");
        firstDog.eat();
        System.out.println("_______________________________________________");
        firstCommonAnimal.eat();
        System.out.println("_______________________________________________");
        firstCommonAnimal.move(5);
        System.out.println("_______________________________________________");
        firstDog.move(5);



    }

}
