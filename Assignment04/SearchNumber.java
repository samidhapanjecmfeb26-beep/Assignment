/*Problem Statement: 
Write a Java program that asks the user to input 5 integers, stores them in an array, and then checks 
whether a specific number (input by the user) is present in the array using the Arrays.asList() method. If 
the number is found, print "Found", otherwise print "Not Found". 
Sample Input: 
Enter 5 integers: 10 20 30 40 50 
Enter the number to search: 30 
Expected Output: 
Found*/


import java.util.Scanner;
import java.util.Arrays;

class SearchNumber
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        Integer  a[] = new Integer [5];

        System.out.println("Enter 5 integers:");
        for(int i = 0; i < a.length; i++)
        {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the number to search:");
        int num = sc.nextInt();

        if(Arrays.asList(a).contains(num))
        {
            System.out.println("Found");
        }
        else
        {
            System.out.println("Not Found");
        }
    }
}