//24. Write a program to find largest digit in a number. 

import java.util.*;

class LargestDigit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int largest = 0;

        while (num > 0) {
            int digit = num % 10;   // get last digit

            if (digit > largest) {
                largest = digit;
            }

            num = num / 10;   // remove last digit
        }

        System.out.println("Largest digit = " + largest);
    }
}