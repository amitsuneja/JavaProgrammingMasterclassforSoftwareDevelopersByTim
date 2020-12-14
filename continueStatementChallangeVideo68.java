// This is very important code for me . It explain 2 important things.
//  see comment in line number 11 and 21

public class Challenge {
    public static void main(String[] args){
        int number = 4;
        int endNumber=10;
        while (number <= endNumber){
            number++;
            if (!isEven(number)){ 
                // if return value is false then execute continue statement
                continue;
            }
            System.out.println("your Number: " + number +  " is an even number");
            // number++;   this program putting it here is wrong as it will become infinite loop
            // as continue statement will never allow this statement to execute
        }
    }

    public static boolean isEven(int numberToCheck){
    //We might have written if else statement but this is better way to return true or false
        return ((numberToCheck % 2) == 0);
    }

}
