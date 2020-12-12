import java.util.Locale;

public class Challenge {

    public static void main(String[] args) {

        char switchValue = ' ';

        switch (switchValue) {
            case 'A':
            case 'a':
                System.out.println("this value of switch Value is A or a: " + switchValue);
                break;
            case 'B':
            case 'b':
                System.out.println("this value of switch Value is B or b: " + switchValue);
                break;
            case 'C':
            case 'c':
                System.out.println("this value of switch Value is C or c: " + switchValue);
                break;
            case 'D':
            case 'd':
                System.out.println("this value of switch Value is D or d: " + switchValue);
                break;
        }

        
        String month = "JANUARY";

        switch(month.toLowerCase(Locale.ROOT)){   // to pass string as a lower case to switch statement.
            case "january":
                System.out.println("this is first month :" + month); // notice actual value is still
                                                                    // in upper case JANUARY
                break;
            case "february":
                System.out.println("this is second month :" + month);
                break;
            default:
                System.out.println("I dont know this month:" + month);
                break;
        }

    }

}
