/*Problem 1: Sum of Two Numbers (Using a Method)
Problem Statement:
Write a Java program that includes a method to calculate the sum of two numbers.
1. Create a method sumOfTwoNumbers() that takes two integers as parameters, calculates their sum,
and returns the result.
2. In the main method, use the Scanner class to prompt the user to enter two integers.
3. Pass the user inputs to the sumOfTwoNumbers() method and print the sum.
Sample Input:
Enter first number: 15
Enter second number: 25
Expected Output:
The sum of 15 and 25 is 40*/
#include<iostream>
using namespace std;

int sumOfTwoNumbers(int x , int y)
	{
		int sum = x + y;
		return sum;
	}

int main()
{
	int a , b;
	cout<<"Enter First Number: "<<endl;
	cin>>a;
	cout<<"Enter Second Number: "<<endl;
	cin>>b;

	int result = sumOfTwoNumbers(a, b);

	cout<<"Sum of "<<a<<" and "<<b<<" is: "<<result<<endl;

	return 0;
}

