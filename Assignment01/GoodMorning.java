/*Display Good Morning Message Based on Time: 
 Task: Create a flowchart to display a "Good Morning" message based on a given time. 
 Next Step: Write a Java program that displays a "Good Morning" message if the 
predefined time is between 5 AM and 12 PM. Use an if statement to implement the logic.*/

Flowchart:-
1.Start.
2.Declare a variable to store time.
3.Assign a predefined value.
4.Check condition If time is between 5 and 12 then display Good Morning.
6.Stop.


class GoodMorning
{
  public static void main(String args[])
  {
    int time = 7;
    
    if(time >=5 && time <= 12)
    {
      System.out.println("Good Morning.");
    }
  }
}
