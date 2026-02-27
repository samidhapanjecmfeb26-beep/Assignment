/*Find the Largest of Three Numbers: 
 Task: Create a flowchart to find the largest of three numbers. 
 Next Step: Write a Java program that finds and prints the largest of three predefined 
numbers using if-else statements.*/


Flowchart:-
1.Start
2.Declare three variables (a, b, c).
3.Assign predefined values.
4.Check if a is greater than both b and c then A is largest.
5.Else if b is greater than both a and c then B is largest.
6.Else C is largest.
7.Display result.
8.Stop.


class LargestNum
{
   public static void main(String args[])
   {
     int a=57, b=33, c= 106;
     if(a>b && a>c)
     {
        System.out.println("A is largest number A="+a);
     }
     if(b>a && b>c)
     {
        System.out.println("B is largest number B="+b);
     }
     if(c>a && c>b)
     {
        System.out.println("C is largest number C="+c);
     }

   }
}