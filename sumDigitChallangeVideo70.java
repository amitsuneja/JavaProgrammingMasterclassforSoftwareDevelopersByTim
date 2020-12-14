public class Challenge {

    public static void main(String[] args) {
        System.out.println(sumDigit(144));
        System.out.println(sumDigit(-9));
        System.out.println(sumDigit(1000));
        System.out.println(sumDigit(9));

    }

    public static int sumDigit(int number){
        if (number <= 9){
            return -1;
        }
        int sum = 0;
        while (number > 0){
            int reminder = number % 10; // 4
            number = number / 10;  // 1
            sum = sum + reminder;

        }
        return sum;
   }
}
