
public class Challenge {

    public static void main(String[] args) {

        char switchValue = '9';

        switch(switchValue) {
            case 'A': case 'a':
                System.out.println("this value of switch Value is A or a: "+ switchValue);
                break;
            case 'B': case 'b':
                System.out.println("this value of switch Value is B or b: "+ switchValue);
                break;
            case 'C': case 'c':
                System.out.println("this value of switch Value is C or c: "+ switchValue);
                break;
            case 'D': case 'd':
                System.out.println("this value of switch Value is D or d: "+ switchValue);
                break;
            default:
                System.out.println("This is Switch Value from default case:" + switchValue);
                break;
        }
    }

}
