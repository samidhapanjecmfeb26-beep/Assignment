/*5. Employee Salary Slip Generator 
Create a Java program to generate salary slips for employees. 
Requirements  
● Accept employee name, ID, basic salary
● Calculate: 
○ HRA = 20% of basic salary 
○ DA = 10% of basic salary 
○ PF = 8% of basic salary 
● Calculate net salary. 
● Display a formatted salary slip. */

import java.util.*;

class EmpSalarySlip
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();

        double hra = 0.20 * basic;
        double da = 0.10 * basic;
        double pf = 0.08 * basic;

        double netSalary = basic + hra + da - pf;

        System.out.println("\n===== SALARY SLIP =====");
        System.out.println("Employee Name : " + name);
        System.out.println("Employee ID   : " + id);
        System.out.println("-----------------------------");
        System.out.println("Basic Salary  : " + basic);
        System.out.println("HRA (20%)     : " + hra);
        System.out.println("DA (10%)      : " + da);
        System.out.println("PF (8%)       : " + pf);
        System.out.println("-----------------------------");
        System.out.println("Net Salary    : " + netSalary);
        System.out.println("=============================");
    }
}