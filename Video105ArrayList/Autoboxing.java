package com.amitsuneja;

import java.util.ArrayList;


public class Main {
    /*
Tip:
ArrayList will only contain object . You cant create
ArrayList<int> numbersInArrayList = new ArrayList<int>

This is incorrect.
Instead create a class "Myintclass.java" or like in created below Main class ,  which have int variable "myIntVar"
and then create object  of call using its constructor and store it in ArrayList.
*/
    /*
    what is Autoboxing ?
    https://docs.oracle.com/javase/tutorial/java/data/autoboxing.html
    Autoboxing is the automatic conversion that the Java compiler makes between the primitive types and their
    corresponding object wrapper classes. For example, converting an int to an Integer, a double to a Double, and so on.

    If the conversion goes the other way, this is called unboxing.

 -------------------------------
|Primitive-type	| Wrapper-class |
 -------------------------------
|boolean	    |Boolean        |
|byte	        |Byte           |
|char	        |Character      |
|float	        |Float          |
|int	        |Integer        |
|long	        |Long           |
|short	        |Short          |
|double	        |Double         |
 --------------------------------
     */




    public static void main(String[] args) {

        ArrayList<Myintclass>  ListofNumbersinArratList = new ArrayList<Myintclass>();
        Myintclass myint = new Myintclass(56);
        ListofNumbersinArratList.add(myint);
        System.out.println(ListofNumbersinArratList.get(0).getmyIntVar());

       // Integer myint = new Integer(56); this is depreciated.=, called boxying
        // boxing converting int into primitive type Integer in above line is called boxing.

        Integer my_int = 700; // removed boxing see above line , which is depreciated
        System.out.println(my_int);
        System.out.println(Integer.valueOf(my_int)); // this is boxing which is not actually required in this version of java.

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








