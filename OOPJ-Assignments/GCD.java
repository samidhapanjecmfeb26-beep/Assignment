//35. Find GCD of two numbers. 

import java.util.*;

class GCD {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int first = sc.nextInt();

        System.out.print("Enter second number: ");
        int second = sc.nextInt();

        int gcd = 1;

        for(int i = 1; i <= first && i <= second; i++) {
            if(first % i == 0 && second % i == 0) {
                gcd = i;
            }
        }

        System.out.println("GCD = " + gcd);
    }
}