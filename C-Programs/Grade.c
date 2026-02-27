/*Q1. Grade Calculator
A student appeared in 5 subjects. Store the marks of each subject as a float.
Compute the total and percentage. Use the ternary operator (no
if-else allowed) to determine and print the grade according to
the table below.
Percentage Grade
>= 75 A
>= 60 B
>= 45 C
< 45 Fail
Print all subject marks, total, percentage, and grade.*/

#include <stdio.h>

int main() {
    
    float maths = 60.0, english = 74.5, hindi = 80.0, science = 52.65, history = 82.0;
    float Total = maths + english + hindi + science + history;
    float percentage = Total / 5;

    char *Grade = (percentage >= 75) ? "A" : (percentage >= 60) ? "B" : (percentage >= 45) ? "C" : "Fail";

    printf("Marks of each subject:\n");
    printf("Maths: %.2f\n", maths);
    printf("English: %.2f\n", english);
    printf("Hindi: %.2f\n", hindi);
    printf("Science: %.2f\n", science);
    printf("History: %.2f\n", history);

    printf("\nTotal: %.2f\n", Total);
    printf("Percentage: %.2f\n", percentage);
    printf("Grade: %s\n", Grade);

    return 0;
}
