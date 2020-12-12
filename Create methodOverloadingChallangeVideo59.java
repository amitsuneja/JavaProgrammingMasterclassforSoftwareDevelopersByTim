//public class Challenge
//{
//    public void test(Integer i)
//    {
//        System.out.println("test(Integer ) ");
//    }
//    public void test(String name)
//    {
//        System.out.println("test(String ) ");
//    }
//    public static void main(String [] args)
//    {
//        Challenge obj = new Challenge();
//        obj.test(null);
//    }
//}

/*
Error java:     Reference to test is ambiguous both method test(java.lang.Integer) in Challenge
                and method test(java.lang.String) in Challenge match

Reason:
The main reason for getting the compile time error in the above example is that here we have Integer and String
as arguments which are not primitive data types in java and this type of argument do not accept any null value.
When the null value is passed the compiler gets confused which method is to be selected as both the
methods in the above example are accepting null.
However, we can solve this to pass specific reference type rather than value.
In this below example, we are passing specific type argument rather than null value.
 */
public class Challenge
{
    public void test(Integer i)
    {
        System.out.println("Method ==> test(Integer)");
    }
    public void test(String name)
    {
        System.out.println("Method ==> test(String) ");
    }
    public static void main(String [] args)
    {
        Challenge obj = new Challenge ();
        Integer a = null;
        obj.test(a);
        String b = null;
        obj.test(b);
    }
}
