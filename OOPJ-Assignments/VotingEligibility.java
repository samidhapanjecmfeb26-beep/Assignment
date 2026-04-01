/* 28. Take user age and: 
● Check eligibility for voting */

import java.util.*;

class VotingEligibility {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18) 
        {
            System.out.println("You are eligible for voting.");
        } 
        else
        {
            System.out.println("You are not eligible for voting.");
        }
    }
}