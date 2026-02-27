/*Print Area of a Square: 
 Task: Create a flowchart to calculate and print the area of a square. 
 Next Step: Write a Java program that calculates the area of a square using the formula 
area = side * side. Use a predefined side length.*/


Flowchart:-
1.Start
2.Declare variables for side and area.
3.Assign a predefined value to the side of the square.
4.Calculate area using the formula.
5.Display the result.
6.Stop


class AOSquare
{
  public static void main(String args[])
  {
     
     int area, side = 5;
     area = side * side;
     System.out.println("Area of Square is:"+area);
  }
}