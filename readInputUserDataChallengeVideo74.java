import java.util.Scanner;

public class readInputUserDataChallengeVideo74 {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        int sumOfNumbers = 0;
        int count = 1;

        while (count <=10){
            System.out.print("Please enter " + count +" Number:");
            boolean testisNextInt = myScanner.hasNextInt();
            if (testisNextInt){
                sumOfNumbers += myScanner.nextInt();
                count++;
            } else {
                System.out.println("Wrong Data Type Entered...");
            }
            myScanner.nextLine();

        }
        myScanner.close();
        System.out.println("Sum of Numbers =" + sumOfNumbers);





    }

}
