/*Create a class Box with private members length, width, and height.
Write:
 A parameterized constructor
 A function setDimensions(int, int, int) that uses this-> to distinguish between
member variables and parameters
 A function volume() to compute the volume
Demonstrate:
 Initialization using constructor
 Assignment using setDimensions()*/

#include<iostream>
using namespace std;

class Box
{
private:
    int length, width, height;

public:
    Box(int l, int w, int h) //parameterized constructor
    {
        length = l;
        width = w;
        height = h;
    }

    void setDimensions(int length, int width, int height)
    {
        this->length = length;
        this->width = width;
        this->height = height;
    }

    int volume()
    {
        return length * width * height;
    }
};

int main()
{
    Box b(20, 20, 20);

    cout << "Volume of Box using constructor: " << b.volume() << endl;

    b.setDimensions(10, 10, 20);

    cout << "Volume of Box after setDimensions: " << b.volume() << endl;

    return 0;
}


/*Initialization and assignment are not the same.
 Initialization gives an object its first value at the time of creation,
 whereas assignment changes the value after the object has already been created.

Initialization is preferred because:
It ensures the object starts in a valid state.
It prevents garbage values.
It is mandatory for constant and reference members.
It improves performance by avoiding unnecessary operations.*/
