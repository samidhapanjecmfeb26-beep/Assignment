/*Print Area of a Rectangle: 
 Task: Create a flowchart to calculate and print the area of a rectangle. 
 Next Step: Write a Java program that calculates the area of a rectangle using the formula 
area = length * width. Use predefined values for length and width.*/


Flowchart:-
1.Start 
2.Declare variables to store length, width, and area.
3.Assign predefined values to length and width.
4.Calculate area using the formula.
5.Display the result.
6.Stop


class AORectangle
{
  public static void main(String args[])
  {
     int area, length, width;
     length = 20;
     width = 10;
     
     area = length * width;
     System.out.println("Area of Rectangle is: "+area);
  }
}