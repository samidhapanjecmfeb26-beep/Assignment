/*7. Mobile Recharge System 
Create a recharge application for prepaid mobile users. 
Requirements 
● Ask for mobile number and recharge amount. 
● Show recharge plans using switch-case. 
● Example: 
○ Rs. 199 → 28 days validity 
○ Rs. 399 → 56 days validity 
○ Rs. 599 → 84 days validity 
● Print recharge confirmation with plan details */

import java.util.*;

class MobileRechargeSystem
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Mobile Number: ");
        String mobile = sc.nextLine();

        System.out.print("Enter Recharge Amount: ");
        int amount = sc.nextInt();

        String validity = "";
        boolean validPlan = true;

        switch(amount)
        {
            case 199:
                validity = "28 Days";
                break;

            case 399:
                validity = "56 Days";
                break;

            case 599:
                validity = "84 Days";
                break;

            default:
                validPlan = false;
        }


        System.out.println("\n===== RECHARGE DETAILS =====");

        if(validPlan)
        {
            System.out.println("Mobile Number : " + mobile);
            System.out.println("Recharge Plan : Rs. " + amount);
            System.out.println("Validity      : " + validity);
            System.out.println("Status        : Recharge Successful ✅");
        }
        else
        {
            System.out.println("Invalid Recharge Amount! ❌");
            System.out.println("Please select a valid plan (199 / 399 / 599)");
        }

        System.out.println("=============================");
    }
}