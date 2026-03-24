//8. Write a program to check whether a year is a leap year. 

class LeapYear
{
	public static void main(String args[])
	{
	   int year = 1998;
           if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
	   {
              System.out.println("Leap Year");
	   }
           else
	   {
              System.out.println("Not a Leap Year");

	   }
	}
}

/*
Output:- Not a Leap Year
*/