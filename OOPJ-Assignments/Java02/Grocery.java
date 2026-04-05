/*
4. Grocery Store Bill Generator 
Create a billing system for a small grocery shop. 
Requirements 
● Accept item names, quantity, and price for multiple items. 
● Store item totals in arrays. 
● Calculate total bill amount. 
● Apply discount: 
○ 10% discount if bill is above Rs. 3000 
● Print the final bill in proper format. */

import java.util.*;

class Grocery
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String itemName[] = new String[n];
        int quantity[] = new int[n];
        double price[] = new double[n];
        double total[] = new double[n];

        double grandTotal = 0;

        // Input
        for(int i = 0; i < n; i++)
        {
            System.out.println("\nEnter details for item " + (i+1));

            System.out.print("Item name: ");
            itemName[i] = sc.nextLine();

            System.out.print("Quantity: ");
            quantity[i] = sc.nextInt();

            System.out.print("Price per item: ");
            price[i] = sc.nextDouble();
            sc.nextLine(); // consume newline

            total[i] = quantity[i] * price[i];
            grandTotal += total[i];
        }

        // Discount
        double discount = 0;
        if(grandTotal > 3000)
        {
            discount = grandTotal * 0.10;
        }

        double finalAmount = grandTotal - discount;

        // Bill Printing
        System.out.println("\n========== GROCERY BILL ==========");
        System.out.println("Item\tQty\tPrice\tTotal");

        for(int i = 0; i < n; i++)
        {
            System.out.println(itemName[i] + "\t" + quantity[i] + "\t" + price[i] + "\t" + total[i]);
        }

        System.out.println("----------------------------------");
        System.out.println("Total Amount: Rs. " + grandTotal);
        System.out.println("Discount: Rs. " + discount);
        System.out.println("Final Amount: Rs. " + finalAmount);
        System.out.println("==================================");
    }
}