/*
2. Student Result Processing System 
Create a program for a school to manage a student’s marks. 
Requirements 
● Accept student name, roll number, and marks in 5 subjects. 
● Calculate total, average, percentage. 
● Display grade using conditions: 
○ 90 and above → A 
○ 75 to 89 → B 
○ 60 to 74 → C 
○ 40 to 59 → D 
○ Below 40 → Fail  */

import java.util.*;

class StudentMarksheet
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        String name;
        int rollNo;
        int hindi, science, maths, english, history;

        System.out.println("Enter Name of Student: ");
        name = sc.nextLine();

        System.out.println("Enter Roll No. of Student: ");
        rollNo = sc.nextInt();

        System.out.println("Enter Marks of Hindi: ");
        hindi = sc.nextInt();

        System.out.println("Enter Marks of Science: ");
        science = sc.nextInt();

        System.out.println("Enter Marks of Maths: ");
        maths = sc.nextInt();

        System.out.println("Enter Marks of English: ");
        english = sc.nextInt();

        System.out.println("Enter Marks of History: ");
        history = sc.nextInt();

        
        int total = hindi + science + maths + english + history;

        double average = total / 5.0;

        double percentage = average;

        char grade;

        if (percentage >= 90)
            grade = 'A';
        else if (percentage >= 75)
            grade = 'B';
        else if (percentage >= 60)
            grade = 'C';
        else if (percentage >= 40)
            grade = 'D';
        else
            grade = 'F';

        System.out.println("\n----- Student Marksheet -----");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
    }
}