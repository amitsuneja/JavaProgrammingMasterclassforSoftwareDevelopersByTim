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


public class my_araay {
  public static void main(String[] args) {
    int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
    for (int i = 0; i < myNumbers.length; ++i) {
      for(int j = 0; j < myNumbers[i].length; ++j) {
        System.out.println(myNumbers[i][j]);
      }
    }
  }
}


/*
ArrayList:
1. Java ArrayList class uses a dynamic array for storing the elements. It is like an array, but there is no size limit. We can add or remove elements anytime.
2. It is found in the java.util package. 
3. Java ArrayList class can contain duplicate elements.
4. Java ArrayList class maintains insertion order.
5. Java ArrayList class is non synchronized.
6. Java ArrayList allows random access because array works at the index basis.
7. In ArrayList, manipulation is little bit slower than the LinkedList in Java because a lot of shifting needs to occur if any element is removed from the array list.

*/

ArrayList<String> list=new ArrayList<String>();//creating new generic arraylist  
