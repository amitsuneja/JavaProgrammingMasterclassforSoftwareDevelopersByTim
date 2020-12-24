package com.amitsuneja;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
// Challenge Types:
// LinkedList Should not accept duplicate entry of city name.
// LinkedList should be in sorted order by alphabetic order.
// that means if you add chandigarh in below list it should come after ambala

public class SortLinkedListAsNewElementAdded {

    private static void printMenu() {
        System.out.println("Available actions:\npress ");
        System.out.println("q - to quit\n" +
                "n - go to next city\n" +
                "p - go to previous city\n" +
                "d - print menu options");
    }


    public static void main(String[] args) {

        LinkedList<String> listofplaces = new LinkedList<String>();

        inOrderAddCity(listofplaces, "delhi");
        inOrderAddCity(listofplaces, "panipat");
        inOrderAddCity(listofplaces, "karnal");
        inOrderAddCity(listofplaces, "ambala");
        inOrderAddCity(listofplaces, "zirakpur");
        inOrderAddCity(listofplaces, "chandigarh");
        inOrderAddCity(listofplaces, "shimla");
        inOrderAddCity(listofplaces, "delhi");
        inOrderAddCity(listofplaces, "delhi");
        printLocations(listofplaces);

        visitCity(listofplaces);



    } // main method ends here


    public static void printLocations(LinkedList<String> listofplaces){
        Iterator<String> iteratorforlistofplaces = listofplaces.iterator();
        while (iteratorforlistofplaces.hasNext()){
            System.out.println(iteratorforlistofplaces.next());
        }
        System.out.println("============================");

    }

    // This code explains power of ListIterator which you cant do with normal Iterator.
    private static boolean inOrderAddCity(LinkedList<String> listofplaces, String newcityname){
        ListIterator<String> listIteratorforlistofplaces =  listofplaces.listIterator();
        while (listIteratorforlistofplaces.hasNext()){
            int comparison = listIteratorforlistofplaces.next().compareTo(newcityname);
            if ( comparison == 0 ){ // =0 means item already present.
                // newcityname is already preset in listofplaces. hence ignore it.
                System.out.println("city " + newcityname + " is already present in listofplaces" );
                return false;
            }else if (comparison > 0){  //new item should appear before this one
                listIteratorforlistofplaces.previous();
                listIteratorforlistofplaces.add(newcityname);
                return true;
            }else if (comparison < 0) { // this means simply move to next city for comparison.
                // example added newcityname=delhi and we are comparing it with current city chandigarh
                // that means simple move on to next city for comparison.
            }
        } // while loop ends here.
        listIteratorforlistofplaces.add(newcityname);  // means at city as last item.
        return true;
    }


    private static void visitCity(LinkedList<String> listofplaces){
        Scanner myScanner = new Scanner(System.in);
        boolean condition = false;

        ListIterator<String> listIteratorforlistofplaces = listofplaces.listIterator();
        if ( listofplaces.isEmpty()){
            System.out.println("no City in itinerary");
            return;
        }
        else {
            printMenu();
        }



        while(!condition) {
            String action = myScanner.nextLine();
            switch (action) {
                case "q":
                    System.out.println("Chutti Khatam Ghar Bhag ja kuttey");
                    condition = true;
                    break;
                case "n":
                    if (listIteratorforlistofplaces.hasNext()) {
                        System.out.println("Now visiting ... " + listIteratorforlistofplaces.next());
                    } else {
                        System.out.println("Come-on this is your lat city in list...");
                    }
                    break;
                case "p":
                    if (listIteratorforlistofplaces.hasPrevious()) {
                        System.out.println("Now visiting back to... " + listIteratorforlistofplaces.previous());
                    } else {
                        System.out.println("Come-on this is your first city in list ...");
                    }
                    break;
                case "d":
                    printMenu();
                    break;
            }

        }
    }

} // SortLinkedListAsNewElementAdded class ends here