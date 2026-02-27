/*Write a Java program that declares three string literals with the same content and prints 
whether all three strings refer to the same object using the == operator. 
Code Example: 
String str1 = "java"; 
String str2 = "java"; 
String str3 = "java"; 
Expected Output: 
All strings point to the same object: true */

class Literal
{
    public static void main(String args[])
    {
        String str1 = "java";
        String str2 = "java";
        String str3 = "java";

        boolean result = (str1 == str2) && (str2 == str3);

        System.out.println("All strings point to the same object: " + result);
    }
}