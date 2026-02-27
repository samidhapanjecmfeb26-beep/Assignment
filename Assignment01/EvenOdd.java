/*Check Odd or Even Number: 
 Next Step: Write a Java program that checks if a predefined number is negative using an 
if-else statement and displays the result. 
 Task: Create a flowchart to determine whether a number is odd or even. 
 Next Step: Write a Java program that checks if a predefined number is odd or even. Use 
an if-else statement and the modulus operator (%) to determine whether the number is 
divisible by 2 or not. 
*/

Flowchart:-
1.Start
2.Declare a variable to store the number.
3.Assign a predefined value to the variable.
4.Check condition If the number is divisible by 2 then print Even.
5.Otherwise print Odd.
6.Display the result.
7.Stop.


class EvenOdd
{
 public static void main(String args[])
 {
   int num = 53;
   if(num%2==0)
   {
     System.out.println("Even Number");
   }
   else
   {
     System.out.println("Odd Number");
   }
 }
}