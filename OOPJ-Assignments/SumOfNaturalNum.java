import java.util.*;
class SumOfNaturalNum
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter tha limit: ");
        int limit = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= limit; i++)
        {
            sum = sum + i;
        }
        System.out.println("Sum of natural number is: "+sum);
    }
}