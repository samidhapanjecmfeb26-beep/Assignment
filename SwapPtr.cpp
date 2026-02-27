/*Declare three integer variables with values: x = 10, y = 20, z = 30.
Create three pointers pointing to these variables: px = &x, py = &y, pz = &z.
Using only pointer dereferencing (do not use x, y, or z directly after declaration):
Swap the values of x and z.
Print the values of all three variables before and after the swap.
Print the addresses stored in each pointer to confirm that the pointers themselves did not change.*/

#include<iostream>
using namespace std;

int main()
{
    int x = 10, y = 20, z = 30;
    int *px = &x;
    int *py = &y;
    int *pz = &z;

    cout<<"Before swapping values of three variables:"<<endl;
    cout << "x = " << *px << ", y = " << *py << ", z = " << *pz << endl;

    int temp = *px;
    *px = *pz;
    *pz = temp;

    cout << "After swapping values of three variables:" << endl;
    cout << "x = " << *px << ", y = " << *py << ", z = " << *pz << endl;

    cout << "Addresses:" << endl;
    cout << "px = " << px << ", py = " << py << ", pz = " << pz << endl;

    return 0;
}