/* 10. Write a program to check whether a character is: 
● Vowel or consonant*/

import java.util.*;
class VowelConsonant
{
	public static void main(String args[])
	{
	   Scanner sc = new Scanner(System.in);

	   System.out.println("Enter character: ");
	   char ch = sc.next().charAt(0);
           
	   if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
	   {
		System.out.println("Character is Vowel.");
	   }
	   else
	   {
		System.out.println("Character is Consonant.");
	   }

	}	
}

/*
output:-
C:\Users\ADMIN\Desktop\CDAC-LAB\OOPJ\OOPJ-Assignments>java VowelConsonant
Enter character:
y
Character is Consonant.

C:\Users\ADMIN\Desktop\CDAC-LAB\OOPJ\OOPJ-Assignments>java VowelConsonant
Enter character:
U
Character is Vowel.*/