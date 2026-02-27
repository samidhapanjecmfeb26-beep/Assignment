/*Problem Statement: 
Write a Java program that asks the user to input 5 integers, stores them in an array, and then sorts the 
array in ascending order using the Arrays.sort() method. After sorting, print the sorted array. 
Sample Input: 
Enter 5 integers: 12 45 23 8 90 
Expected Output: 
Sorted array: 8 12 23 45 90*/


import java.util.Scanner;
import java.util.Arrays;

class SortArray
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

        System.out.print("Sorted array: ");
        for(int num : a)
        {
            System.out.print(num + " ");
        }
    }
}