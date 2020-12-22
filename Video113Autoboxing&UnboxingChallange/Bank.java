package com.amitsuneja;

import java.util.ArrayList;

public class Bank {
    private String bankname;
    private ArrayList<Branch> listofbranches;

    public Bank(String bankname, ArrayList<Branch> listofbranches) {
        this.bankname = bankname;
        this.listofbranches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchname){
        if (findBranch(branchname) == null){
            Branch newbranch = new Branch(branchname);
            listofbranches.add(newbranch);
            return true;
        }
        return false;
    }

    private Branch findBranch(String branchname){
        for (int i = 0; i < listofbranches.size(); i++ ){
            Branch branch_obj = listofbranches.get(i);
            if (branch_obj.getBranchname().equalsIgnoreCase(branchname)){
                return branch_obj;
            }
        }
        return null;
    }

    public Boolean addNewCustomerToBranch(String branchname, String Customername, double initialamount){
        Branch branch_obj = findBranch(branchname);
        if (branch_obj != null){
            return branch_obj.newCustomerAdd(Customername, initialamount);
        }
        return false;
    }

    public Boolean addTransaction(String branchname, String Customername, double amount){
        Branch branch_obj = findBranch(branchname);
        if (branch_obj != null){
            Customer customer_obj = branch_obj.findCustomer(Customername);
            if (customer_obj != null){
                branch_obj.addCustomerTransaction(Customername, amount);
                return true;
            }
        }
        return false;
    }

    public boolean listCustomers(String branchname, boolean isshowtransaction){
        Branch branch_obj = findBranch(branchname);
        if (branch_obj != null){
            ArrayList<Customer> listofcustomers = branch_obj.getListofcustomers();
            for (int i = 0; i < listofcustomers.size() ; i++){
                Customer customer_obj = listofcustomers.get(i);
                System.out.println(i + ". Name = " + customer_obj.getNameofcustomer());
                if (isshowtransaction){
                    System.out.println("transactions: ");
                    ArrayList<Double> customerpassbook = customer_obj.getCustomerpassbook();
                    for (int j= 0 ; j< customerpassbook.size(); j++){
                        System.out.println("Amount = " +customerpassbook.get(j).doubleValue());

                    }
                }
            }
            return true;
        }else{
            return true;
        }

    }








} // Bank Class ends here
