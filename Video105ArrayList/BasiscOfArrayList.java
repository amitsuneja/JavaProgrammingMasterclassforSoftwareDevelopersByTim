package com.amitsuneja;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        System.out.println("-----------------------");


        for (int i=0; i<cars.size(); i++){
            System.out.println(cars.get(i));
         }
        System.out.println("-----------------------");

        /*
        remove element by index in ArrayList
         */
       cars.remove(1);
        for (int i=0; i<cars.size(); i++){
            System.out.println(cars.get(i));
        }
        System.out.println("-----------------------");
        /*
        modify element by index in ArrayList
         */
        cars.set(1, "AmitSuneja");
        for (int i=0; i<cars.size(); i++){
            System.out.println(cars.get(i));
        }
        System.out.println("-----------------------");
        /*
        add element by index in ArrayList
         */
        cars.add(1, "santro");
        System.out.println(cars);
        System.out.println("-----------------------");
        /*
         Collections.sort()
        */
        Collections.sort(cars);
        System.out.println(cars);
        System.out.println("-----------------------");

        /*
        remove all elements in ArrayList
         */
        cars.clear();
        System.out.println(cars);
        System.out.println("-----------------------");
        /*
        Elements in an ArrayList are actually objects. In the examples above, we created elements (objects)
        of type "String". Remember that a String in Java is an object (not a primitive type). To use other types,
        such as int, you must specify an equivalent wrapper class: Integer.
        For other primitive types, use: Boolean for boolean, Character for char, Double for double, etc.
        */

        ArrayList<Integer> listOfNumbers = new ArrayList<Integer>();
        System.out.println("size is zero listOfNumbers.size() = " + listOfNumbers.size());
        listOfNumbers.add(6);
        listOfNumbers.add(0);
        listOfNumbers.add(9);
        listOfNumbers.add(3);
        listOfNumbers.add(5);
        listOfNumbers.add(0);
        Collections.sort(listOfNumbers);
        System.out.println("listOfNumbers =" + listOfNumbers);


        Iterator itr=listOfNumbers.iterator();//getting the Iterator

        while(itr.hasNext()){//check if iterator has the elements
            System.out.println(itr.next());//printing the element and move to next
        }



    }


}
