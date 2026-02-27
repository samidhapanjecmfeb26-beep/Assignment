/*Problem Statement: 
Write a Java program that uses a for-each loop to calculate the sum of all elements in a given integer 
array. The program should ask the user to input 5 integers, store them in an array, and then compute the 
sum of these numbers using the for-each loop. 
Sample Input: 
Enter 5 integers: 4 6 8 2 10 
Expected Output: 
The sum of all numbers is: 30*/

import java.util.Scanner;
class SumForEach
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        int sum = 0;
        System.out.println("Enter 5 integers:");
        for(int i = 0; i < a.length; i++)
        {
            a[i] = sc.nextInt();
        }

        for(int num : a)
        {
            sum = sum + num;
        }
        System.out.println("The sum of all numbers is: " + sum);
    }
}