/*
3. Write a program to convert: 
○ int → double 
○ double → int
*/

class ConvertIntDouble
{
	public static void main(String args[])
	{
	   int a = 10;
	   double b = 127.93;
           double c = a; //implicit typecasting
           int d = (int) b; //explicit typecasting

	   System.out.println("Before typecasting integer is: " + a);
	   System.out.println("After typecasting integer to double is: " + c);
	   System.out.println("Before typecasting double is: " + b);
	   System.out.println("After typecasting double to integer is: " + d);
	}
}

/* output:-
Before typecasting integer is: 10
After typecasting integer to double is: 10.0
Before typecasting double is: 127.93
After typecasting double to integer is: 127
*/