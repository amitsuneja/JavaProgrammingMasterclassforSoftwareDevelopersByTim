package com.amitsuneja;

// The Customer class should have an arraylist of transactions
// (Name, and the ArrayList of doubles.)

import java.util.ArrayList;

public class Customer {

    private String nameofcustomer;
    private ArrayList<Double> customerpassbook;


    public Customer(String nameofcustomer, double initialamount) {
        this.nameofcustomer = nameofcustomer;
        this.customerpassbook = new ArrayList<Double>();
        addMoney(initialamount);
    }


    public void addMoney(double amount){
        customerpassbook.add(amount);
    }




    public String getNameofcustomer() {
        return nameofcustomer;
    }


    public ArrayList<Double> getCustomerpassbook() {
        return customerpassbook;
    }


} // Customer class ends here
