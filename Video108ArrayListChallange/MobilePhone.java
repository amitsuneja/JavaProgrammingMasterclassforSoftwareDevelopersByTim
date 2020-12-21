package com.amitsuneja;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class MobilePhone {
    private Scanner myScanner = new Scanner(System.in);
    private ArrayList<Contacts> listOfContacts;
    public MobilePhone(ArrayList<Contacts> listOfContacts) {
        this.listOfContacts = listOfContacts;
    }


    public void addToContactList(){
        System.out.print("Please Enter Name:");
        String cname = myScanner.nextLine().toLowerCase(Locale.ROOT);
        System.out.print("Please Enter Contact Number:");
        String number = myScanner.nextLine().toLowerCase(Locale.ROOT);
        Contacts contactsObject = new Contacts(cname, number);
        listOfContacts.add(contactsObject);

    }



    public void displayAllContactsInContactList(){
        System.out.println("You have "+listOfContacts.size()+" in your contact list");
        for(int i=0; i< listOfContacts.size(); i++){
            System.out.println("Name: " + listOfContacts.get(i).getcName());
            System.out.println("ContactNumber: " + listOfContacts.get(i).getCellNumber());
        }
    }



    public void displaySpecificContactInContactListByIndexNumber(int i){
        System.out.println("Name: " + listOfContacts.get(i).getcName());
        System.out.println("ContactNumber: " + listOfContacts.get(i).getCellNumber());
    }



    public int  searchByNameInContactList(){
        System.out.println("Enter name to search phonebook?");
        String name = myScanner.nextLine();
        int indexNumber = Integer.MIN_VALUE;
        boolean isFound = false;
        for(int i=0; i< listOfContacts.size(); i++){
            if (name.toLowerCase(Locale.ROOT).equals(listOfContacts.get(i).getcName())){
                isFound = true;
                indexNumber = i;
            }
        }
        if(isFound){
            displaySpecificContactInContactListByIndexNumber(indexNumber);
        }else {
            System.out.println("this name does not exist in your Phone");
        }
        return indexNumber;
    }




    public void searchByNumberInContactList(){
        System.out.println("please enter number to search ?");
        String number = myScanner.nextLine();
        int indexNumber = Integer.MIN_VALUE;
        boolean isFound = false;
        for(int i=0; i< listOfContacts.size(); i++){
            if ( number.toLowerCase(Locale.ROOT).equals(listOfContacts.get(i).getCellNumber())){
                isFound = true;
                indexNumber = i;
            }
        }
        if(isFound){
            displaySpecificContactInContactListByIndexNumber(indexNumber);
        }else {
            System.out.println("this number does not exist in your Phone");
        }
    }




    public void eraseContactList(){
        System.out.println("Are you sure to remove all contacts from contact list ?");
        String result = myScanner.nextLine().toLowerCase(Locale.ROOT);
        if (result.equals("yes")){
            listOfContacts.clear();
        }
    }




    public void deleteByIndexNumberFromContactList(int i) {
        listOfContacts.remove(i);
    }




    public void modifySpecificContactByNameInContactList(){
        System.out.println("Please Enter Name to modify number:");
        String name = myScanner.nextLine();
        int index = Integer.MIN_VALUE;
        index = searchByNameInContactList1(name.toLowerCase(Locale.ROOT));
        if (index != Integer.MIN_VALUE) {
            System.out.println("Please enter new Number:");
            String number = myScanner.nextLine();
            deleteByIndexNumberFromContactList(index);
            Contacts contactsObject = new Contacts(name, number);
            listOfContacts.add(contactsObject);
        }else {
            System.out.println("no contact by this name");
        }
    }

    public int searchByNameInContactList1(String name){
        int indexNumber = Integer.MIN_VALUE;
        boolean isFound = false;
        for(int i=0; i< listOfContacts.size(); i++){
            if ( name.toLowerCase(Locale.ROOT).equals(listOfContacts.get(i).getcName())){
                isFound = true;
                indexNumber = i;
            }
        }
        if(isFound){
            displaySpecificContactInContactListByIndexNumber(indexNumber);
            return indexNumber;
        }else {
            System.out.println("this number does not exist in your Phone");
            return Integer.MIN_VALUE;
        }

    }






} // class ends here






































