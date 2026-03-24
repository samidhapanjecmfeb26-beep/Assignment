/*
Write a program to check whether a number is: 
○ Positive 
○ Negative 
○ Zero 
*/

class PositiveNegative
{
	public static void main(String args[])
        {
           int num = 25;
	   if(num % 2 == 0)
           {
             System.out.println("Even Number");
           }
           else if(num % 2 != 0)
           {
             System.out.println("Odd Number");
           }
	   else
	   {
             System.out.println("Number is Zero");
           }

        }
}
