/*Q7. const Constant in Functions
Write two C++ functions that use a const float PI = 3.14159f declared at the global scope:
float circleArea(float radius) — returns the area of a circle.
float circlePerimeter(float radius) — returns the circumference of a circle.
In main(), call both functions with radius = 7.0 and print the results to 4 decimal places.
Additionally, add this line inside main() and describe what happens when you compile:
PI = 3.0f;   // attempt to modify const
Do not delete the line — comment it out after observing the error and 
write the compiler error message as a comment beside it.*/

#include <iostream>
#include <iomanip>  // For std::setprecision
using namespace std;

const float PI = 3.14159f;
float circleArea(float radius) {
    return PI * radius * radius;
}

float circlePerimeter(float radius) {
    return 2 * PI * radius;
}

int main() {
    float radius = 7.0f;
    cout << fixed << setprecision(4);  //function call
    cout << "Area: " << circleArea(radius) << endl;
    cout << "Perimeter: " << circlePerimeter(radius) << endl;
    
    // PI = 3.0f;  // error: assignment of read-only variable ‘PI’

    return 0;
}