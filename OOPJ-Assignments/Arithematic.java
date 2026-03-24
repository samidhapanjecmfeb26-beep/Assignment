/* 9. Create a simple calculator using switch: 
○ Input: two numbers + operator 
○ Perform: +, -, *, /
*/

class Arithematic
{
	public static void main(String args[])
	{
           int a = 100, b = 200, add, sub, mul, div;

           add = a + b;
           System.out.println("Addition is: " + add);

	   sub = a - b;
           System.out.println("Substraction is: " + sub);

           mul = a * b;
           System.out.println("Multiplication is: " + mul);

           div = a / b;
           System.out.println("Division is: " + div);

	}
}