/* 10. Restaurant Order Management System 
Create a program for restaurant management. 
Requirements 
● Display a food menu with price list. 
● Let the user order multiple items. 
● Use loop and switch-case for repeated ordering. 
C-DAC Mumbai
● Calculate total amount. 
● Add GST of 5%. 
● Print final bill.*/

import java.util.*;

class RestaurantOrderManagementSystem 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int choice;
        double total = 0;
        char more;

        do {
            // Menu
            System.out.println("\n===== RESTAURANT MENU =====");
            System.out.println("1. Pizza      - Rs. 200");
            System.out.println("2. Burger     - Rs. 100");
            System.out.println("3. Pasta      - Rs. 150");
            System.out.println("4. Sandwich   - Rs. 80");
            System.out.println("5. Coffee     - Rs. 50");
            System.out.println("============================");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    total += 200;
                    System.out.println("Pizza added to order");
                    break;

                case 2:
                    total += 100;
                    System.out.println("Burger added to order");
                    break;

                case 3:
                    total += 150;
                    System.out.println("Pasta added to order");
                    break;

                case 4:
                    total += 80;
                    System.out.println("Sandwich added to order");
                    break;

                case 5:
                    total += 50;
                    System.out.println("Coffee added to order");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

            System.out.print("Do you want to order more? (y/n): ");
            more = sc.next().charAt(0);

        } while(more == 'y' || more == 'Y');

        // GST calculation (5%)
        double gst = total * 0.05;
        double finalAmount = total + gst;

        // Final Bill
        System.out.println("\n===== FINAL BILL =====");
        System.out.println("Total Amount : Rs. " + total);
        System.out.println("GST (5%)     : Rs. " + gst);
        System.out.println("----------------------------");
        System.out.println("Final Amount : Rs. " + finalAmount);
        System.out.println("============================");
    }
}