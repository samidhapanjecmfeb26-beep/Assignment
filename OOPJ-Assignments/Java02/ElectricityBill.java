/*1. Electricity Bill Calculator 
Create a Java program to calculate a household electricity bill. 
Requirements 
● Accept customer name, consumer number, and units consumed. 
● Calculate bill using slab rates such as: 
○ First 100 units → Rs. 5 per unit 
○ Next 100 units → Rs. 7 per unit 
○ Above 200 units → Rs. 10 per unit 
● If the bill exceeds Rs. 1500, apply a 5% surcharge. 
● Display complete bill details. */

import java.util.*;

class ElectricityBill
{
    public static void main(String args[])
    {
        String CusName;
        long CusNo;
        double Unit;
        double ElectricityBill = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of customer: ");
        CusName = sc.nextLine();

        System.out.println("Enter the consumer number: ");
        CusNo = sc.nextLong();

        System.out.println("Enter the units consumed: ");
        Unit = sc.nextDouble();

        if(Unit <= 100)
        {
            ElectricityBill = Unit * 5;
        }
        else if(Unit <= 200)
        {
            ElectricityBill = (100 * 5) + ((Unit - 100) * 7);
        }
        else
        {
            ElectricityBill = (100 * 5) + (100 * 7) + ((Unit - 200) * 10);
        }

        if(ElectricityBill > 1500)
        {
            ElectricityBill = ElectricityBill + (ElectricityBill * 0.05);
        }
        System.out.println("\n----- Electricity Bill -----");
        System.out.println("Customer Name: " + CusName);
        System.out.println("Consumer Number: " + CusNo);
        System.out.println("Units Consumed: " + Unit);
        System.out.println("Total Bill: Rs. " + ElectricityBill);
    }
}