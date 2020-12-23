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
8. ArrayList can not be used for primitive types, like int, char, etc. We need a wrapper class for such cases.

*/

ArrayList<String> list=new ArrayList<String>();//creating new generic arraylist  





public class Arraylist { 
    public static void main(String[] args) 
    { 
        int n = 5; 
  
        // Here al is an array of arraylist having 
        // n number of rows.The number of columns on 
        // each row depends on the user. 
        // al[i].size() will give the size of the 
        // i'th row 
        ArrayList<Integer>[] al = new ArrayList[n]; 
  
        // initializing 
        for (int i = 0; i < n; i++) { 
            al[i] = new ArrayList<Integer>(); 
        } 
  
        // We can add any number of columns to each 
        // rows as per our wish 
        al[0].add(1); 
        al[0].add(2); 
        al[1].add(5); 
        al[2].add(10); 
        al[2].add(20); 
        al[2].add(30); 
        al[3].add(56); 
        al[4].add(34); 
        al[4].add(67); 
        al[4].add(89); 
        al[4].add(12); 
  
        for (int i = 0; i < n; i++) { 
            for (int j = 0; j < al[i].size(); j++) { 
                System.out.print(al[i].get(j) + " "); 
            } 
            System.out.println(); 
        } 
    } 
} 
