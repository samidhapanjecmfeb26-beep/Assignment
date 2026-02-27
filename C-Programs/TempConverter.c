/*Temperature Converter
Write a C program with the following two functions — declare prototypes before main(), 
define them after main():float celsiusToFahrenheit(float c) — converts Celsius to Fahrenheit 
(Formula: F = (C × 9/5) + 32) float fahrenheitToCelsius(float f) — converts Fahrenheit to Celsius 
(Formula: C = (F − 32) × 5/9) In main(), call both functions with sample values and 
print the results formatted to 2 decimal places.*/

#include <stdio.h>

float celsiusToFahrenheit(float c);  //Function prototype
float fahrenheitToCelsius(float f);

int main() {
    float celsius = 40.0, fahrenheit = 108.0;

    printf("Celsius %f to Fahrenheit: %f\n", celsius, celsiusToFahrenheit(celsius));
    printf("Fahrenheit %f to Celsius: %f\n", fahrenheit, fahrenheitToCelsius(fahrenheit));

    return 0;
}

float celsiusToFahrenheit(float c)   // Function definitions
{ 
    return (c * 9 / 5) + 32;
}

float fahrenheitToCelsius(float f) 
{
    return (f - 32) * 5 / 9;
}