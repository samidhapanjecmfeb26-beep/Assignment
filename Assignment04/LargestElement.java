/* Problem Statement: 
Write a Java program that asks the user to input 5 integers, stores them in an array, and then finds and 
prints the largest element in the array. (Explore in-built method to solve this) 
Sample Input: 
Enter 5 integers: 12 45 67 23 89 
Expected Output: 
The largest element is: 89*/

import java.util.Scanner;
import java.util.Arrays;

class LargestElement
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

        Arrays.sort(a);
        int largest = a[a.length - 1];

        System.out.println("The largest element is: " + largest);
    }
}

