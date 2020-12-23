/*
# JavaProgrammingMasterclassforSoftwareDevelopersByTim
This Repo is to for Java Basics .
Udmey Course Java Programming Master Class For Software Developers By Tim


Array : - 
1. Java array is an object which contains elements of a similar data type. Additionally, The elements of an array are stored in a contiguous memory location. It is a data structure where we store similar elements. 
2. Each item in an array is called an element
3. A Java array variable can also be declared like other variables with [] after the data type.
4. We can store only a fixed set of elements in a Java array.(cat change Lenght of array)
5. The variables in the array are ordered and each have an index beginning from 0.The first element of the array is stored at the 0th index, 2nd element is stored on 1st index and so on.
6. he length of an array must be specified by an int value and not long or short.
7. dataType[] arrayRefVar = new dataType[arraySize];
   dataType[] arrayRefVar = {value0, value1, ..., valuek};
*/


public class Main {
  public static void main(String[] args) {
    int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
    for (int i = 0; i < myNumbers.length; ++i) {
      for(int j = 0; j < myNumbers[i].length; ++j) {
        System.out.println(myNumbers[i][j]);
      }
    }
  }
}





