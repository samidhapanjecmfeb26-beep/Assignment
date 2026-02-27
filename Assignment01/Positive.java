/*Check Positive Number: 
 Task: Create a flowchart to check whether a number is positive. 
 Next Step: Write a Java program that checks if a predefined number is positive using an 
if-else statement and prints the appropriate message.*/

Flowchart:-
1.Start the program.
2.Declare a variable to store the number.
3.Assign a predefined value.
4.Check condition If number > 0 then number is Positive
5.Otherwise number is Not positive
6.Display result.
7.Stop.


class Positive{
   public static void main(String args[])
   {
      int num = -15;
      if(num>=0)
      {
         System.out.println("Number is a Positive Number.");
      }
      else
      {
        System.out.println("Number is Not a Positive Number.");
      }
   }
}