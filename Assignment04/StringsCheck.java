/*Write a Java program that creates two string variables using string literals with the same 
content. Then, print whether both variables point to the same object. 
Code Example: 
String str1 = "hello"; 
String str2 = "hello"; 
Expected Output: 
Both variables point to the same object: true*/

class StringsCheck
{
    public static void main(String args[])
    {
        String str1 = "hello";
        String str2 = "hello";

        boolean result = (str1 == str2);

        System.out.println("Both variables point to the same object: " + result);
    }
}