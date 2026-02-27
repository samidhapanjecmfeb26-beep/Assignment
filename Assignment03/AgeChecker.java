/*Problem 2: Simple Age Checker (Using a Method) 
Problem Statement: 
Write a Java program that includes a method to check the age category.  
1. Create a method checkAgeCategory() that takes an integer (age) as a parameter and prints 
whether the user is a minor, adult, or senior citizen. 
2. In the main method, use the Scanner class to prompt the user to enter their age. 
3. Pass the user's age to the checkAgeCategory() method. 
Sample Input: 
Enter your age: 30 
Expected Output: 
You are an adult.*/


import java.util.Scanner;
class AgeChecker
{
   void checkAgeCategory(int age)
   {
      if(age>0 && age<18)
      {
        System.out.println("Your are a Minor.");
      }
      else if(age>17 && age<60)
      {
        System.out.println("Your are an Adult.");
      }
      else
      {
        System.out.println("Your are a Senior Citizen.");
      }
   }

  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your age:");
    int age = sc.nextInt();
    
    AgeChecker a = new AgeChecker();
    a.checkAgeCategory(age);
  }
}