/* Bonus Problem: Menu-Driven Java Program 
(Switch-Case) 
Problem 1: Grade Evaluation System */

import java.util.Scanner;
class BonusProblem
{
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the program number between 1 to 5:\n" +
                   "Program 1: Grade Evaluation System\n" +
                   "Program 2: Leap Year Check\n" +
                   "Program 3: Day of the Week\n" +
                   "Program 4: Identify Default Values of Variables\n" +
                   "Program 5: Exit");
      int program = sc.nextInt();

      switch(program)
      {
         case 1:
            int maths=80, science=85, history=90;
            int avg = (maths + science + history) / 3;

            System.out.println("Average Marks = " + avg);

            if(avg >= 90)
               System.out.println("Grade A");
            else if(avg >= 70)
               System.out.println("Grade B");
            else if(avg >= 50)
               System.out.println("Grade C");
            else if(avg >= 30)
               System.out.println("Grade D");
            else
               System.out.println("Fail");
            break;


         case 2:
            int year = 2024;

            if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
               System.out.println(year + " is Leap Year");
            else
               System.out.println(year + " is Not Leap Year");
            break;


         case 3:
            int day = 3;

            switch(day)
            {
               case 1: System.out.println("Monday"); break;
               case 2: System.out.println("Tuesday"); break;
               case 3: System.out.println("Wednesday"); break;
               case 4: System.out.println("Thursday"); break;
               case 5: System.out.println("Friday"); break;
               case 6: System.out.println("Saturday"); break;
               case 7: System.out.println("Sunday"); break;
               default: System.out.println("Invalid day");
            }
            break;


         case 4:
            byte a = 10;
            short b = 400;
            int c = 10000;
            long d = 150000L;
            float e = 5.75f;
            double f = 19.87;
            char g = 'S';
            boolean h = true;


            System.out.println("Value of byte a is " + a);
            System.out.println("Value of short b is " + b);
            System.out.println("Value of int c is " + c);
            System.out.println("Value of long d is " + d);
            System.out.println("Value of float e is " + e);
            System.out.println("Value of double f is " + f);
            System.out.println("Value of char g is " + g);
            System.out.println("Value of boolean h is " + h);
            break;


         case 5:
            System.out.println("Exit");
            break;


         default:
            System.out.println("Invalid program");
      }
   }
}
