package com.amitsuneja;

class JavaExample{
    static int i = 10;
    static String s = "Beginnersbook"; // if you make s as non static then
    // error - java: non-static variable s cannot be referenced from a static context

    //This is a static method
    public static void main(String args[])
    {
        System.out.println("i:"+i);
        System.out.println("s:"+s);
    }
}

/*
i:10
s:Beginnersbook
*/
