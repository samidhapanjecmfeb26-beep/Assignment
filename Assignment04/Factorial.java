/*Problem Statement: 
Write a Java program that asks the user for a number N and calculates the factorial of N using a for loop. 
Sample Input: 
Enter a number: 5 
Expected Output: 
Factorial of 5 is 120 */



import java.util.Scanner;
class Factorial
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();

    int fact = 1;

    for(int i = 1; i <= num; i++)
    {
      fact = fact * i;
    }

    System.out.println("Factorial of "+num +" is " + fact);
  }
}

