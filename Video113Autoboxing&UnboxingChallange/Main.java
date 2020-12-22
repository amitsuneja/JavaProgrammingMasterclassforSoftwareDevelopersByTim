package com.amitsuneja;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Branch> icicibranchlist = new ArrayList<Branch>();
        Bank icicibank = new Bank("icici", icicibranchlist);
        icicibank.addBranch("sec18");
        icicibank.addBranch("sec19");
        icicibank.addBranch("sec20");
        icicibank.addBranch("sec137");
        icicibank.addNewCustomerToBranch("sec18", "Amit", 10.00);
        icicibank.addNewCustomerToBranch("sec18", "Raj", 1.76);
        icicibank.addNewCustomerToBranch("sec18", "Rahul", 10.50);
        icicibank.addNewCustomerToBranch("sec19", "amit", 100000.50);
        icicibank.addNewCustomerToBranch("sec19", "mala", 1.86);
        icicibank.addNewCustomerToBranch("sec19", "tina", 10.50);
        icicibank.addNewCustomerToBranch("sec88", "Amit", 10000000.50);
        icicibank.addTransaction("sec18","Amit", 100000);
        icicibank.addTransaction("sec18","Amit", 100000);
        icicibank.addTransaction("sec18","Ami9t", 90);
        icicibank.listCustomers("sec18", true);
        icicibank.listCustomers("sec90", true);
        icicibank.listCustomers("sec19", true);








    } // main method ends here




} // Main class End here
