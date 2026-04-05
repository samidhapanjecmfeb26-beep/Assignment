/* 9. Daily Expense Tracker 
Create a program to track a person’s daily expenses. 
Requirements 
● Accept expenses for 7 days in an array. 
● Calculate: 
○ total weekly expense 
○ average expense 
○ highest expense 
○ lowest expense 
● Display the day on which the highest expense occurred */

import java.util.*;

class DailyExpenseTracker 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        double expenses[] = new double[7];
        String days[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        double total = 0;
        double highest, lowest;
        int highDay = 0;

        // Input expenses
        for(int i = 0; i < 7; i++)
        {
            System.out.print("Enter expense for " + days[i] + ": ");
            expenses[i] = sc.nextDouble();
            total += expenses[i];
        }

        // Initialize highest & lowest
        highest = expenses[0];
        lowest = expenses[0];

        // Find highest, lowest, and day of highest expense
        for(int i = 1; i < 7; i++)
        {
            if(expenses[i] > highest)
            {
                highest = expenses[i];
                highDay = i;
            }

            if(expenses[i] < lowest)
            {
                lowest = expenses[i];
            }
        }

        double average = total / 7;

        // Output
        System.out.println("\n===== WEEKLY EXPENSE REPORT =====");
        System.out.println("Total Expense   : " + total);
        System.out.println("Average Expense : " + average);
        System.out.println("Highest Expense : " + highest + " on " + days[highDay]);
        System.out.println("Lowest Expense  : " + lowest);
        System.out.println("=================================");
    }
}