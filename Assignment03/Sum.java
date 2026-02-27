/*Problem 1: Sum of Two Numbers (Using a Method) 
Problem Statement: 
Write a Java program that includes a method to calculate the sum of two numbers. 
1. Create a method sumOfTwoNumbers() that takes two integers as parameters, calculates their sum, 
and returns the result. 
2. In the main method, use the Scanner class to prompt the user to enter two integers. 
3. Pass the user inputs to the sumOfTwoNumbers() method and print the sum. 
Sample Input: 
Enter first number: 15 
Enter second number: 25 
Expected Output: 
The sum of 15 and 25 is 40.*/



import java.util.Scanner;
class Sum
{
  void sumOfTwoNumbers(int first, int second)
  {
    int sum = first + second;
    System.out.println("Sum of two numbers is:"+sum);
  }

  public static void main(String args[])
  {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the first number:");
     int first = sc.nextInt();

     System.out.print("Enter the second number:");
     int second = sc.nextInt();
  
     Sum s = new Sum();
     s.sumOfTwoNumbers(first, second);

  }

}