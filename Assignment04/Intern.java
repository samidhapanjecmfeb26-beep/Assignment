/* Problem Statement: 
Write a Java program that creates a string using the new keyword and then calls the 
intern() method. Print whether the interned string is pointing to the same object as the 
original string literal. 
Code Example: 
String str1 = new String("hello"); 
String str2 = str1.intern(); 
String str3 = "hello"; 
Expected Output: 
Is str2 and str3 pointing to the same object? true*/


class Intern
{
    public static void main(String args[])
    {
        String str1 = new String("hello");
        String str2 = str1.intern();
        String str3 = "hello";

        System.out.println("Is str2 and str3 pointing to the same object? " + (str2 == str3));
    }
}