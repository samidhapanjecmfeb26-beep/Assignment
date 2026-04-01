//26. Write a program to check whether a number is Armstrong

import java.util.*;

class Armstrong {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int sum = 0;
        int digits = 0;

        // Count number of digits
        int temp = num;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        // Calculate sum of powers
        temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        // Check Armstrong
        if (sum == original) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }
}