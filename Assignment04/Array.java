/* Problem Statement: 
Write a Java program that uses a for-each loop to print all elements of an integer array. The program 
should ask the user to input 5 integers, store them in an array, and then print all the elements using a 
for-each loop. 
Sample Input: 
Enter 5 integers: 3 7 12 5 8 
Expected Output: 
3 7 12 5 8 */

import java.util.Scanner;
class Array
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Enter 5 integers:");

        for(int i = 0; i < a.length; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Array elements are:");

        for(int num : a)
        {
            System.out.print(num + " ");
        }
    }
}