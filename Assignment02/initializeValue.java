/*Problem 4: Identify the Values of Uninitialized Variables 
Scenario: 
You are working on a program that handles different data types. Your manager has asked you to quickly 
check the values of various variables, but you’re in a rush and forget to initialize them. As you go through 
the code, you expect some values to show up, but Java has something else in mind. Your task is to fix the 
issue and ensure the variables hold proper values. 
Instructions: 
1. Declare the following variables: 
byte a; 
short b; 
int c; 
long d; 
float e; 
double f; 
char g; 
boolean h; 
2. Print out their values*/


class initializeValue 
{
  public static void main(String[] args)
  {
     byte a = 10;
     short b = 400;
     int c = 10000;
     long d = 150000L;
     float e = 5.75f;
     double f = 19.87;
     char g = 'S';
     boolean h = true;

     System.out.println("Value of byte a is " + a);
     System.out.println("Value of short b is " + b);
     System.out.println("Value of int c is " + c);
     System.out.println("Value of long d is " + d);
     System.out.println("Value of float e is " + e);
     System.out.println("Value of double f is " + f);
     System.out.println("Value of char g is " + g);
     System.out.println("Value of boolean h is " + h);
  }
}
