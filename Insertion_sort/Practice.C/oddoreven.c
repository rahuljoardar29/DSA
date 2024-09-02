#include <stdio.h>
int main()
    // 1. Write a program to check if a number that is given by the user is odd/even ?
{
     int number;
    printf("Enter the number\n");
    scanf("%d", &number);

    if (number % 2 == 0)
    {
        printf("%d is a even number\n", number);
    }
    else
    {
        printf("%d is a odd number\n", number);
    }
    return 0;
}