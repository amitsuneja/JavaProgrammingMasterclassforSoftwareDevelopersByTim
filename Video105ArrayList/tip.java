package com.amitsuneja;

import java.util.ArrayList;


public class Main {
    /*
Tip:
ArrayList will only contain object . You cant create
ArrayList<int> numbersInArrayList = new ArrayList<int>

This is incorrect.
Instead create a class "Myintclass.java" or like in created below Main class ,  which have int variable "myIntVar"  and then create object  of call using
its constructor and store it in ArrayList.
*/




    public static void main(String[] args) {

        ArrayList<Myintclass>  ListofNumbersinArratList = new ArrayList<Myintclass>();
        Myintclass myint = new Myintclass(56);
        ListofNumbersinArratList.add(myint);
        System.out.println(ListofNumbersinArratList.get(0).getmyIntVar());



    } //main method end here.


} // Main Class ends here













class Myintclass {
    // if you are declaring class in separate file like Myintclass.java
    // then
    // public class Myintclass
    // else
    // class Myintclass


    // declaring class variables
    private int myIntVar;



    // Creating constructor
    public Myintclass(int myIntVar){
        this.myIntVar = myIntVar;
    } // constructor end here.



    // create setter
    public void setmyIntVar(int myIntVar){
        this.myIntVar = myIntVar;
    } // setter end here.



    // create Getter
    public int getmyIntVar(){
        return myIntVar;
    } // Getter end here.


} // Myintclass ends here








