

/*
A Java access modifier specifies which classes can access a given class and its fields, constructors and methods.
Access modifiers can be specified separately for a class, its constructors, fields and methods.

---------------------------------------------------------
                |private  |	default	|protected	|public |
---------------------------------------------------------
Class	        |No       |	Yes	    |No	        |Yes    |
Nested Class	|Yes	  |Yes	    |Yes	    |Yes    |
Constructor	    |Yes	  |Yes	    |Yes	    |Yes    |
Method	        |Yes	  |Yes	    |Yes	    |Yes    |
Field	        |Yes	  |Yes	    |Yes	    |Yes    |
---------------------------------------------------------
 */

/*
 Naming Convention:-preferred naming convention for class is first character of class should be upper case.

 Path Of Class file:-Path of this Car.java class file is workSpace > example > src > com > amitsuneja >  Car.java
 where amitsuneja.com is package name , example is projectName
     Also workSpace > example > src > com > amitsuneja > Main.java is present here.

 Path Of IML file:-Path of example.iml file is workSpace > example > example.iml file

 */

package com.amitsuneja;

import java.util.Locale;

public class Car {   // public keyword is access modifier. public means unrestricted access by other programs.
    // Fields or state or attributes or characteristics of car object
    private int doors;
    private  int wheels;
    private String model;
    private String color;
    public void setModel(String model) {
        model = model.toLowerCase(Locale.ROOT);
        if ( ( model.equals("santro") ) || ( model.equals("nano)") ) ) {
            this.model = model;
        } else {
            this.model = "unknown";
        }

    }
    public String getModel(){
        
        return  model;
    }

}


    /*
    private Access Modifier - If a method or variable is marked as private (has the private access modifier assigned
    to it), then only code inside the same class can access the variable, or call the method. Code inside
    subclasses cannot access the variable or method, nor can code from any external class.
    Classes cannot be marked with the private access modifier. Marking a class with the private access modifier would
    mean that no other class could access it, which means that you could not really use the class at all.

    Here is an example of assigning the private access modifier to a field:
    The member variable time has been marked as private. That means, that the member variable time inside the Clock
    class cannot be accessed from code outside the Clock class.
    Two methods getTime() and setTime() can access the time member variable. The two methods are declared public,
    meaning they can be called from code anywhere in your application


    public class Clock {
    private long time = 0;

    public long getTime() {
        return this.time;
    }

    public void setTime(long theTime) {
        this.time = theTime;
    }
}


private Constructors - If a constructor in a class is assigned the private Java access modifier, that means that the
constructor cannot be called from anywhere outside the class. A private constructor can still get called from
other constructors, or from static methods in the same class

    public class Clock {

        private long time = 0;

        private Clock(long time) {
            this.time = time;
        }

        public Clock(long time, long timeOffset) {
            this(time);
            this.time += timeOffset;
        }

        public static Clock newClock() {
            return new Clock(System.currentTimeMillis());
        }

    }




    */


