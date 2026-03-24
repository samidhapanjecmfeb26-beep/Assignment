/*Take two numbers (int and double) and perform: 
○ Addition 
○ Division 
○ Type casting result to int */

class Typecasting
{
	public static void main(String args[])
	{
	   int a = 10, add, div;
	   double b = 120.5;
	   add = a + (int) b; //type casting
	   div = a / (int) b;
	
	   System.out.println("Addition is : " + add);
	   System.out.println("Division is : " + div);

	}
}

/* Output:-
   Addition is : 130
   Division is : 0
*/