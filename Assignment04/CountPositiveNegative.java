/*Problem Statement: 
Write a Java program that asks the user to input 6 integers, stores them in an array, and then counts how 
many positive and negative numbers are present in the array. 
Sample Input: 
Enter 6 integers: -5 3 7 -2 0 8 
Expected Output: 
Positive numbers: 3 
Negative numbers: 2 */


import java.util.Scanner;
class CountPositiveNegative
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int a[] = new int[6];
        int positive = 0;
        int negative = 0;

        System.out.println("Enter 6 integers:");
        for(int i = 0; i < a.length; i++)
        {
            a[i] = sc.nextInt();
        }

        for(int num : a)
        {
            if(num > 0)
            {
                positive++;
            }
            else if(num < 0)
            {
                negative++;
            }
        }

        System.out.println("Positive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
    }
}