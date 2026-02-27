/*Write a Java program that asks the user to input 5 integers, stores them in an array, and then calculates and 
prints the average of the elements in the array. 
Sample Input: 
Enter 5 integers: 10 20 30 40 50 
Expected Output: 
The average of the numbers is: 30.0*/


import java.util.Scanner;
class AverageArray
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int a[] = new int[5];
        int sum = 0;
        double average;

        System.out.println("Enter 5 integers:");
        for(int i = 0; i < a.length; i++)
        {
            a[i] = sc.nextInt();
            sum = sum + a[i];
        }

        average = (double)sum / a.length;

        System.out.println("The average of the numbers is: " + average);
    }
}