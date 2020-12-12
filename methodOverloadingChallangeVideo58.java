// Udemy - Java Programming Masterclass for Software Developers - by Tim
// Video No 58 - Challenge Question


public class Challenge {


    public static void main(String[] args) {

        double  result2=calcFeetAndInchesToCentimeters(10);
        System.out.println("result2 ="+result2 + " Centimeters");

        double  result1=calcFeetAndInchesToCentimeters(13,1);
        System.out.println("result1 ="+result1 + " Centimeters");

    }


    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if((feet < 0) || (inches < 0) || (inches > 12)) {
            return -1;
        }
        return ((inches * 2.54d) + (feet * 12d * 2.54d));
    }


    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches < 0){
            return -1;
        }
        double feet =  (int) inches / 12d;
        double remainingInches = (int) inches % 12d;
        return calcFeetAndInchesToCentimeters(feet,remainingInches);
    }

}

// Udemy - Java Programming Masterclass for Software Developers - by Tim
// Video No 59 - Recap
/*
Two or more methods can have same name if they differ in parameters (different number of parameters,
different types of parameters, or both). These methods are called overloaded methods and this feature
is called method overloading.
Example System.out.println() , you can print int or string with same function.

Method overloading is achieved by either:
1. changing the number of arguments.
2. or changing the datatype of arguments.
3. Method overloading is not possible by changing the return type of methods.
 */

