/*Problem 6: Calculate the Sum of Numbers from 1 to N (Using for Loop) 
Problem Statement: 
 Write a Java program that calculates the sum of all integers from 1 to N (where N is a positive integer) 
using a for loop. The program should: 
1. Create a method calculateSum() that takes a number N and calculates the sum of all integers from 
1 to N. 
2. Use a for loop to iterate through all integers from 1 to N and add them up. 
 
Sample Input: 
Enter a number: 5 
Expected Output: 
The sum of numbers from 1 to 5 is: 15*/

import java.util.Scanner;
class SumONum
{
  void calculateSum()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = sc.nextInt();
     int sum=0;
     for(int i=1; i<=num; i++)
     {
        sum = sum + i;
     }
     System.out.println("Sum of " + "1 to " + num + " is " + sum);

  }
  
  public static void main(String args[])
  {
    SumONum s = new SumONum();
    s.calculateSum();
  }
}