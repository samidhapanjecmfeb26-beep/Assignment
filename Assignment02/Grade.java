/*Problem 1: Grade Evaluation System 
Write a Java program that calculates the average marks of a student and determines the grade based on the 
following criteria: 
Grade A: Average marks ≥ 90 
Grade B: Average marks between 70 and 89 
Grade C: Average marks between 50 and 69 
Grade D: Average marks between 30 and 49 
Fail: Average marks < 30 
Predefined Values (Try with different values as well): 
● Marks in Maths = 80 
● Marks in Science = 85 
● Marks in History = 90 
Expected Output: 
Average Marks: 85 
Grade: B*/


class Grade
{
  public static void main(String args[])
  {
      int maths=80, science=85, history=90, avg;
      avg = (maths + science + history) / 3;
      System.out.println("Average Marks = "+avg);
      if( avg >= 90)
      {
         System.out.println("Grade A");
      }
      else if( avg <= 89 && avg >=70)
      {
        System.out.println("Grade B");
      }
      else if( avg <= 69 && avg >=50)
      {
        System.out.println("Grade C");
      }
      else if( avg <= 49 && avg >=30)
      {
        System.out.println("Grade D");
      }
      else
      {
        System.out.println("Fail");
      }
  }
}