/*11. Print numbers from 1 to 50 using: 
● for loop 
● while loop*/

class PrintOneToFifty
{
	public static void main(String args[])
	{
	  int num = 1;
	  System.out.println("Numbers from 1 to 50: ");

	  /*
	  for(int i = 1; i<=50; i++)
	  {
	      System.out.println(i);
	  } */

	int i = 1;
	while(i <= 50)
        {
           System.out.println(i);
	   i++;
	}

	}
}