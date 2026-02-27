/*
Q2. Type Size Explorer
Write a C program that prints the size in bytes of each of the following types using
sizeof:
short int, int, long int, long long int, unsigned int, float, double, long double, char
Then answer in a comment inside your code:
Which two types have the same size on your machine? Does
unsigned int have a different size than int?
 */

 #include <stdio.h>
int main() {
    printf("Size of short int: %d bytes\n", sizeof(short int));
    printf("Size of int: %d bytes\n", sizeof(int));
    printf("Size of long int: %d bytes\n", sizeof(long int));
    printf("Size of long long int: %d bytes\n", sizeof(long long int));
    printf("Size of unsigned int: %d bytes\n", sizeof(unsigned int));
    printf("Size of float: %d bytes\n", sizeof(float));
    printf("Size of double: %d bytes\n", sizeof(double));
    printf("Size of long double: %d bytes\n", sizeof(long double));
    printf("Size of char: %d bytes\n", sizeof(char));

    return 0;
}

/*
1. Which two types have the same size?
ans :- int and unsigned int have the same size.

2.Does unsigned int have a different size than int?
- No, unsigned int has the same size as int.
