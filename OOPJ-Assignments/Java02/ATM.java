/*
3. ATM Simulation 
Create a simple ATM system. 
Requirements 
● Show a menu using switch-case: 
1. Check Balance 
2. Deposit Money 
3. Withdraw Money 
4. Exit 
● Start with an initial balance. 
● Prevent withdrawal if balance is insufficient. 
● Continue showing the menu until the user chooses Exit. */

import java.util.*;

class ATM
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        double balance = 10000;  
        int choice;

        do {
            System.out.println("\n----- ATM MENU -----");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.println("Current Balance: Rs. " + balance);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double deposit = sc.nextDouble();
                    balance = balance + deposit;
                    System.out.println("Amount deposited successfully!");
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = sc.nextDouble();

                    if(withdraw <= balance)
                    {
                        balance = balance - withdraw;
                        System.out.println("Please collect your cash.");
                    }
                    else
                    {
                        System.out.println("Insufficient balance!");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using ATM!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while(choice != 4);  
    }
}