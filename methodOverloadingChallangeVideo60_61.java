public class Challenge {

    public static final String INVALID_MESSAGE = "Invalid Value";

    public static void main(String[] args) {
        System.out.println(getDurationString(61, 5));
        System.out.println(getDurationString(3600));
        System.out.println(getDurationString(-10));

    }

    public static String getDurationString(int minutes, int seconds){
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)){
            return (INVALID_MESSAGE);
        }
        int hours = minutes / 60;
        minutes = hours % 60;

        String strhours = convertIntToString(hours);
        String strminutes = convertIntToString(minutes);
        String strseconds = convertIntToString(seconds);

        return (strhours + "h " + strminutes + "m " + strseconds + "s ");
    }

    public static String getDurationString(int seconds){
        if (seconds < 59) {
            return (INVALID_MESSAGE);
        }
        int minutes = seconds / 60;
        seconds = seconds % 60;
        return getDurationString(minutes, seconds);
    }

    public static String convertIntToString(int number){
        String strnumber;
        if (number >= 0 && number <= 9){
            strnumber =  ("0" + number );
        } else {
            strnumber = String.valueOf(number);
        }
        return strnumber;
    }


}
