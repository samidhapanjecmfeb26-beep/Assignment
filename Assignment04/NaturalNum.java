/*Problem Statement: 
Write a Java program that asks the user for a number N and then prints the numbers from 1 to N using a 
for loop. 
Sample Input: 
Enter a number: 10 
Expected Output: 
1 2 3 4 5 6 7 8 9 10*/

import java.util.Scanner;
class NaturalNum
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number:");
    int num = sc.nextInt();
  
    for(int i =1 ; i<=num; i++)
    {
      System.out.println(i);
    }
  }
}