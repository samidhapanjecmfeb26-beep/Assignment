/*Write a Java program that creates two string objects using the new keyword with the 
same content. Then, print whether both objects are the same using the == operator and 
the .equals() method. 
Code Example: 
String str1 = new String("hello"); 
String str2 = new String("hello"); 
Expected Output: 
Using == : false 
Using .equals(): true*/


class StringCompare
{
    public static void main(String args[])
    {
        String str1 = new String("hello");
        String str2 = new String("hello");

        System.out.println("Using == : " + (str1 == str2));
        System.out.println("Using .equals(): " + str1.equals(str2));
    }
}