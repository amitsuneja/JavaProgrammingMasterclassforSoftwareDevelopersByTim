package com.amitsuneja;

import java.util.Iterator;
import java.util.LinkedList;

public class Demo {

    public static void main(String[] args) {

        LinkedList<String> listofplaces = new LinkedList<String>();

        listofplaces.add("delhi");
        listofplaces.add("panipat");
        listofplaces.add("karnal");
        listofplaces.add("ambala");
        listofplaces.add("zirakpur");
        listofplaces.add("chandigarh");
        listofplaces.add("shimla");
        printLocations(listofplaces);
        listofplaces.add(1, "newcity");
        printLocations(listofplaces);
        listofplaces.remove(5);
        printLocations(listofplaces);


    }


    public static void printLocations(LinkedList<String> listofplaces){
        Iterator<String> iteratorforlistofplaces = listofplaces.iterator();
        while (iteratorforlistofplaces.hasNext()){
            System.out.println(iteratorforlistofplaces.next());
        }
        System.out.println("============================");

        }
}
