package com.amitsuneja;

import java.util.ArrayList;

public class Branch {

    private String branchname;
    private ArrayList<Customer> listofcustomers;


    public Branch(String branchname) {
        this.branchname = branchname;
        this.listofcustomers = new ArrayList<Customer>();
    }


    public Boolean newCustomerAdd(String customername, double initialamount){
        if(findCustomer(customername) == null){
            Customer newcustomer_obj = new Customer(customername,initialamount);
            listofcustomers.add(newcustomer_obj);
            return true;
        }
        return false;
    }

    public Boolean addCustomerTransaction(String customername, double amount){
        Customer existingCustomer_obj = findCustomer(customername);
        if(existingCustomer_obj != null){
            existingCustomer_obj.addMoney(amount);
            return true;
        }
        return false;
    }

    public Customer findCustomer(String customername){
        for (int i = 0; i < listofcustomers.size(); i++ ){
            Customer existingCustomer_obj = listofcustomers.get(i);
            if (customername.equalsIgnoreCase(existingCustomer_obj.getNameofcustomer())){
                return existingCustomer_obj;
            }
        }
        return null;
    }


    public String getBranchname() {
        return branchname;
    }

    public ArrayList<Customer> getListofcustomers() {
        return listofcustomers;
    }
} // Branch Class ends here
