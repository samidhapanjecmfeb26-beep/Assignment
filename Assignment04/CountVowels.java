/*Write a Java program that asks the user for a string and counts the number of vowels (a, 
e, i, o, u) in the string. The program should then print the total number of vowels. 
Sample Input: 
Enter a string: programming 
Expected Output: 
The number of vowels in 'programming' is: 3*/

import java.util.Scanner;
class CountVowels
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int count = 0;

        for(int i = 0; i < str.length(); i++)
        {
            char ch = Character.toLowerCase(str.charAt(i));

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                count++;
            }
        }

        System.out.println("The number of vowels in '" + str + "' is: " + count);

        sc.close();
    }
}