/*Problem Statement: 
Write a Java program that asks the user for a string and then prints the reverse of that 
string. 
Sample Input: 
Enter a string: hello 
Expected Output: 
Reversed string: olleh */

import java.util.Scanner;

class ReverseString
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

        System.out.println("Reversed string: " + rev);

        sc.close();
    }
}