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
        for (int i=0; i<=5; i++){
            System.out.println(i);
        }
        // System.out.println(i);

        int j;
        for (j=0; j<=5; j++){
            System.out.println(j);
        }
         System.out.println(j);

    }



}
