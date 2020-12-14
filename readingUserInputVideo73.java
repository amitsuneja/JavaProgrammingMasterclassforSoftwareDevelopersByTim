import java.util.Calendar;
import java.util.Scanner;

public class readingUserInputVideo73 {

    public static void main(String[] args) {

        Scanner myScannerObj = new Scanner(System.in); // Create Scanner Object
        System.out.print("Please enter your year of birth: "); //user input data here
        boolean testHasNextInt = myScannerObj.hasNextInt();
        // based on user input this variable will be true ot false

        if (testHasNextInt){  // execute if user enter int type data
            int myYearOfBirth = myScannerObj.nextInt();
            myScannerObj.nextLine();     // to handle enter key pressed by user
            int myAge = Calendar.getInstance().get(Calendar.YEAR) - myYearOfBirth; // current year - user DOB
            if ( myAge < 0 || myAge > 100){ //if age calculation is incorrect
                userInputError(myScannerObj);
            }
            System.out.print("Please enter your Name:");
            String myName = myScannerObj.nextLine();
            System.out.println("Hey " + myName + " ,You are " + myAge + " years old.");
            myScannerObj.close();
         } else { // execute if user enter wrong data type i.e. non int type data
            userInputError(myScannerObj);
        }
    }


    public static void userInputError(Scanner myScannerObj){
        myScannerObj.close();
        System.out.println("You Entered wrong year of birth ");
        System.exit(-1);
    }


}
