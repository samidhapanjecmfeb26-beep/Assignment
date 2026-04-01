// 13. Write a program to print multiplication table of a number.
import java.util.*;
class Table
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("Multiplication table of "+ num + " is: ");
        for(int i = 1; i <= 10; i++)
        {
            int tab = i * num;
            System.out.println(tab);
        }
    }
}