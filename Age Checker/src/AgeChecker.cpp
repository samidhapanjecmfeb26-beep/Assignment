/*Problem 2: Simple Age Checker (Using a Method)
Problem Statement:
Write a Java program that includes a method to check the age category.
1. Create a method checkAgeCategory() that takes an integer (age) as a parameter and prints
whether the user is a minor, adult, or senior citizen.
2. In the main method, use the Scanner class to prompt the user to enter their age.
3. Pass the user's age to the checkAgeCategory() method.
Sample Input:
Enter your age: 30
Expected Output:
You are an adult.*/

#include<iostream>
using namespace std;

void checkAgeCategory(int age)
{
	if(age>0 && age<18)
	      {
	        cout<<"Your are a Minor."<<endl;
	      }
	      else if(age>17 && age<60)
	      {
	        cout<<"Your are an Adult."<<endl;
	      }
	      else
	      {
	        cout<<"Your are a Senior Citizen.";
	      }

}
int main()
{
	int age;
	cout<<"Enter your age: "<<endl;
	cin>>age;
	checkAgeCategory(age);

	return 0;
}
