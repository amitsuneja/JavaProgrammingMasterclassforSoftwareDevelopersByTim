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

      //  Integer myint = new Integer(56); this is depreciated.
        Integer my_int = 700; // removed boxing see above line , which is depreciated
        System.out.println(my_int);

        ArrayList<Integer>  ListofIntsinArratList = new ArrayList<Integer>();
        Integer one_int = 800; // removed boxing
        ListofIntsinArratList.add(one_int);
        System.out.println(ListofIntsinArratList.get(0));




    } //main method end here.


} // Main Class ends here













class Myintclass {
    // if you are declaring class in separate file like Myintclass.java
    // then
    // public class Myintclass
    // else
    // class Myintclass


    // declaring class variables always declare them as private
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








