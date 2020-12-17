package com.amitsuneja;

class SimpleStaticExample
{
    // This is a static method
    static void myMethod()
    {
        System.out.println("static method got executed.");
    }

    public static void main(String[] args)
    {
        /* You can see that we are calling this
         * method without creating any object.
         */
        myMethod();
    }
}
