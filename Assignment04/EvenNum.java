/* Write a Java program that asks the user for a number N and prints all the even numbers from 1 to N using 
a for loop. 
Sample Input: 
Enter a number: 10 
Expected Output: 
2 4 6 8 10 */

import java.util.Scanner;
class EvenNum
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number:");
    int num = sc.nextInt();
  
    for(int i =1 ; i<=num; i++)
    {
      if(i % 2 == 0)
      System.out.println(i);
    }
  }
}