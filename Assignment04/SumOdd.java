/*Write a Java program that asks the user for a number N and calculates the sum of all odd numbers 
between 1 and N using a for loop. 
Sample Input: 
Enter a number: 10 
Expected Output: 
The sum of odd numbers from 1 to 10 is: 25*/


import java.util.Scanner;
class SumOdd
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number:");
    int num = sc.nextInt();
    int sum = 0;
    for(int i =1 ; i<=num; i++)
    {
      if(i % 2 != 0)
      sum = sum + i;
    }
   System.out.println("The sum of odd numbers from 1 to " + num + " is " + sum);
  }
}