public class parseNumberFromString {

    public static void main(String[] args) {

        String text = "2020.51";  // java.lang.NumberFormatException if we give "2020.51a"
        double doubleNumber = Double.parseDouble(text);
        float floatNumber = Float.parseFloat(text);

        text += 1;
        doubleNumber += 1;
        floatNumber += 1;

        System.out.println("text =" + text); // 2020.511 appended 1 in end of string
        System.out.println("doubleNumber =" + doubleNumber); // 2021.51 added number
        System.out.println("floatNumber =" + floatNumber); // 2021.51 added number


    }
}
