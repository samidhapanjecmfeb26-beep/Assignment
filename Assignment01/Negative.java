/*Check Negative Number: 
 Task: Create a flowchart to check whether a number is negative. 
3. Check Odd or Even Number: 
 Next Step: Write a Java program that checks if a predefined number is negative using an 
if-else statement and displays the result. */


Flowchart:-
1.Start.
2.Declare a variable to store the number.
3.Assign a predefined value.
4.Check condition If number < 0 then number is Negative
5.Otherwise number is Positive
6.Display result.
7.Stop.



class Negative
{
  public static void main(String args[])
  {
    int num = -86;
    if(num<=0)
    {
      System.out.println("Number is Negative.");
    }
    else
   {
      System.out.println("Number is Positive.");
   }
  }
}