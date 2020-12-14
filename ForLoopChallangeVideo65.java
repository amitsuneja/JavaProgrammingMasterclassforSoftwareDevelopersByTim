public class Challenge {
    public static void main(String[] args) {


        /* what is difference between these two for loops?
        Answer - Notice the first loop we initialize variable "i" with in for statement , that means this
                 i variable will be destroy the movement control comes out of for loop. See carefully we
                 commented the println as it was giving error .

                 In second loop , we have defined the variable j before loop start. that means it will be
                 available after for loop ends. Note even when condition met the value is still incremented
                 and  printed outside loop.
         */
        for (int i=0; i<=5; i++){  // we initialize variable with begning of for loop
            // i variable will be destroy the movement control comes out of for loop
            // which means we cant use it outside loop.

            System.out.println(i);
        }

        int j; // we initialized j before staring the loop.This will be available after loop is finished.
        for (j=0; j<=5; j++){
            System.out.println(j);
        }
        System.out.println(j);
        System.out.println("****************************");



        int totalSumOfNumbers = 0;
        int countOfNumbers = 0;
        for (int i=1; i<=1000; i++){
            if (( i % 3 == 0) && ( i % 5 == 0 )){  // test if number is divisble by 3 and 5
                System.out.println(i);
                totalSumOfNumbers += i;
                countOfNumbers += 1;
            }
            if (countOfNumbers == 5){
                break;      // this statement will break the for loop.
            }

        }
        System.out.println("totalSumOfNumbers =" + totalSumOfNumbers);
        System.out.println("****************************");

/*
While loop
 */

        int count = 0; // Note : count has to be defined before the start of loop.
        while (count <=5){
            System.out.println("i=" + count);
            count ++;
        }
        System.out.println("****************************");

        count = 0;
        while (true){  // Note : Most commonly used loop, i used last time in unix when copying
            if (count >= 6 ){    // snapshot VDH to blob storage and sleep the process while copy in progess
                break;
            }
            System.out.println("i=" + count);
            count ++;
        }
        System.out.println("****************************");
        count = 9;
        do {
            System.out.println("i=" + count);
            count ++;
        }while (count <=5); // Note : we initialized count at 9 so condition as false , But still thil loop
        // will run once irrespective of condition is false.
        System.out.println("****************************");


    }

}
