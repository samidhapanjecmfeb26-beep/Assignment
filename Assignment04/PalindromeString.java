/*Problem Statement: 
Write a Java program that asks the user for a string and checks whether the string is a 
palindrome. A palindrome is a string that reads the same backward as forward (ignoring 
spaces and punctuation). 
Sample Input: 
Enter a string: madam 
Expected Output: 
The string 'madam' is a palindrome.*/


import java.util.Scanner;
class PalindromeString
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String rev = "";

        for(int i = str.length() - 1; i >= 0; i--)
        {
            rev = rev + str.charAt(i);
        }

        if(str.equalsIgnoreCase(rev))
        {
            System.out.println("The string '" + str + "' is a palindrome.");
        }
        else
        {
            System.out.println("The string '" + str + "' is not a palindrome.");
        }

        sc.close();
    }
}