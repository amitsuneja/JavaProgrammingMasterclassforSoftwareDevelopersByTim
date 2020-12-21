package com.amitsuneja;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        ArrayList<Contacts> listOfContacts = new ArrayList<Contacts>();
        MobilePhone M1 = new MobilePhone(listOfContacts);
        Scanner myScanner = new Scanner(System.in);


        boolean quit = false;
        int choice = 0;

        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = myScanner.nextInt();
            myScanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    M1.displayAllContactsInContactList();
                    break;
                case 2:
                    M1.addToContactList();
                    break;
                case 3:
                    M1.modifySpecificContactByNameInContactList();
                    break;
                case 4:
                    M1.eraseContactList();
                    break;
                case 5:
                    M1.searchByNameInContactList();
                    break;
                case 6:
                    M1.searchByNumberInContactList();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }

    }  // main method end here




    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To this print menu....");
        System.out.println("\t 1 - To print the list of all contacts in you phone.");
        System.out.println("\t 2 - To add contact to phone.");
        System.out.println("\t 3 - To modify contact by name");
        System.out.println("\t 4 - To erase contact List.");
        System.out.println("\t 5 - To search contact list by Name");
        System.out.println("\t 6 - To search contact list by phone Number.");
        System.out.println("\t 7 - To quit the application.");

    }


} // Main Class ends here


