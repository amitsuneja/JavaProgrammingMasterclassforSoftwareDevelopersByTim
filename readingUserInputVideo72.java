import java.util.Scanner;

public class readingUserInputVideo72 {

    public static void main(String[] args) {

        Scanner scannerNo1 = new Scanner(System.in);
/*
new Scanner(System.in);
means create new object of class "Scanner".

scannerNo1 = new Scanner(System.in);
name this new object of Scanner class as "scannerNo1"

Scanner scannerNo1
create variable named scannerNo1 of data type Scanner

System.in
is just like we have System.out.print and System.out.println to print text on console .
Similarly we have System.in  to read text from console

 */

        System.out.print("please enter your name :");
/*
System.out.print will print text and leave cursor at same line.
Where as System.out.println will print text and move cursor to next line
 */

        String myName = scannerNo1.nextLine();
        scannerNo1.close(); // You must close Scanner object once  your work is done.
        System.out.println("You have sweet name : " + myName);

    }

}
