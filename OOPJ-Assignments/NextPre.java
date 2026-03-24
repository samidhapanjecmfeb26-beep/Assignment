/*
Take a character input and print: 
○ Next character 
○ Previous character
*/

class NextPre
{
	public static void main(String args[])
	{
	   char c = 'M';
 	   char p = (char) (c - 1) ;
	   char n = (char) (c + 1);
          
           System.out.println("Previous character of M is: " + p);
	   System.out.println("Next character of M is: " + n);
	}
}

/*
output:-
Previous character of M is: L
Next character of M is: N
*/