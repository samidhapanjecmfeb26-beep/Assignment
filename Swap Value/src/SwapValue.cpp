/*Write three functions:
void swapByValue(int a, int b);
void swapByAddress(int *a, int *b);
void swapByReference(int &a, int &b);
Call all three in main() and observe which one actually swaps values. */


#include<iostream>
using namespace std;

void swapByValue(int a, int b)
{
	int temp = a;
	a = b;
	b = temp;

	cout << "After Swapping By Value: " << endl;
	cout << "A: " << a << " B: " << b << endl;
}

void swapByAddress(int *a, int *b)
{
	int temp = *a;
	*a = *b;
	*b = temp;

	cout << "After Swapping By Address: " << endl;
	cout << "A: " << *a << " B: " << *b << endl;
}

void swapByReference(int &a, int &b)
{
	int temp = a;
	a = b;
	b = temp;

	cout << "After Swapping By Reference: " << endl;
	cout << "A: " << a << " B: " << b << endl;
}

int main()
{
	int x = 10, y = 20;

	cout << "Before Swapping:" << endl;
	cout << "x: " << x << " y: " << y << endl;

	swapByValue(x, y);
	swapByAddress(&x, &y);
	swapByReference(x, y);

	return 0;
}

/*Explain how reference variables act as aliases and how that affects swapByReference().
 *Ans:-
 In the function swapByReference(int &a, int &b), the parameters a and b become references to the actual variables passed from main() (for example x and y).
 Instead of creating copies of the values, the function works directly with the original variables.
 when the values of a and b are swapped inside the function, the original variables in main() are also swapped.
 This happens because a and b are simply alternate names (aliases) for those original variables.*/
