/*
#include <stdio.h> 
void doubleIt(int n) { 
    n = n * 2; 
printf("Inside doubleIt: %d\n", n); 
} 
int main() { 
int num = 7; 
    doubleIt(num); 
printf("In main after call: %d\n", num); 
return 0; 
}
Output : - Inside doubleIt: 14
In main after call: 7*/


#include <iostream>
using namespace std;

void doubleIt(int &n) { // pass by reference
    n = n * 2;
    cout << "Inside doubleIt: " << n << endl;
}

int main() {
    int num = 7;
    doubleIt(num);
    cout << "In main after call: " << num << endl;
    return 0;
}

/*Output:-
        Inside doubleIt: 14
        In main after call: 14   */