package com.amitsuneja;
import static com.amitsuneja.Myscanner.*;
import java.util.Scanner;

public class Hamburger {

    private String breadType;
    private boolean isMeat;
    private double priceOfBurger;
    private Lettuce myLettuce;
    private boolean addLettuce;
    private Tomato myTomato;
    private boolean addTomato;
    private Carrot myCarrot;
    private boolean addCarrot;
    private Spinach mySpinach;
    private boolean addSpinach;
    private Scanner myScanner = new Scanner(System.in);


    public Hamburger(String breadType, boolean isMeat, double priceOfBurger) {
        this.breadType = breadType;
        this.isMeat = isMeat;
        this.priceOfBurger = priceOfBurger;
        System.out.println("Current cost of burger is: " + this.priceOfBurger);

    }

    public void customizeHamBurger(){
        System.out.println(" Would like to add some Lettuce?");
        addLettuce = scanbool();
        if (addLettuce){
            myLettuce= new Lettuce(true);
        }else{
            myLettuce= new Lettuce(false);
        }
        scanLine();

        System.out.println(" Would like to add some Tomato?");
        addTomato = scanbool();
        if (addTomato){
            myTomato = new Tomato(true);
            }else{
            myTomato = new Tomato(false);
        }
        scanLine();

        System.out.println(" Would like to add some carrot?");
        addCarrot = scanbool();
        if (addCarrot){
            myCarrot = new Carrot(true);
        }else{
            myCarrot = new Carrot(false);
        }
        scanLine();

        System.out.println(" Would like to add some Spinach?");
        addSpinach = scanbool();
        if (addSpinach){
            mySpinach = new Spinach(true);
        }else{
            mySpinach = new Spinach(false);
        }
        scanLine();

    }

     public double getTotalCost(){

        if (this.myLettuce != null){
            if (myLettuce.isHaveLettuce()){
                System.out.println("Charged " + myLettuce.getCostOfLettuce() + "for Lettuce" );
                priceOfBurger += myLettuce.getCostOfLettuce();
            }
        }
        if (this.myTomato != null) {
            if (myTomato.isHaveTomato()) {
                System.out.println("Charged " + myTomato.getCostOfTomato() + "for Tomato");
                priceOfBurger += myTomato.getCostOfTomato();
            }
        }
        if (this.myCarrot != null) {
            if (myCarrot.isHaveCarrot()) {
                System.out.println("Charged " + myCarrot.getCostOfCarrot() + "for Carrot");
                priceOfBurger += myCarrot.getCostOfCarrot();
            }
        }
        if (this.mySpinach != null) {
            if (mySpinach.isHaveSpinach()) {
                System.out.println("Charged " + mySpinach.getCostOfSpinach() + "for Spinach");
                priceOfBurger += mySpinach.getCostOfSpinach();
            }
        }
        return priceOfBurger;
    }

}
