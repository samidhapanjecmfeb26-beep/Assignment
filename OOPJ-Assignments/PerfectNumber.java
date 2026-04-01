//37. Check whether a number is perfect number.

import java.util.*;

class PerfectNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;

        for(int i = 1; i <= num / 2; i++) {
            if(num % i == 0) {
                sum = sum + i;
            }
        }

        if(sum == num) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not a Perfect Number");
        }
    }
}