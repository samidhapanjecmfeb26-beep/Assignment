//Write a program to find the largest of three numbers.

class LargestThree
{
	public static void main(String args[])
	{
           int a = 10, b = 25, c =78;
	   if(a > b && a > c)
	   {
	      System.out.println("A is greater");
	   }
           if(b > a && b > c)
	   {
	      System.out.println("B is greater");
	   }
	   else
	   {
	      System.out.println("C is greater");
	   }

	}
}