// 27 Write a program in C to display the first n terms of Fibonacci series.
// Input number of terms to display : 10
// Expected Output :
// Here is the Fibonacci series upto to 10 terms :
// 0 1 1 2 3 5 8 13 21 34

#include <stdio.h>

int main()
{
    int fib1 = 0, fib2 = 1, fib3, num, cnt = 0;
    printf("Enter the value of num\n");
    scanf("%d", &num);
    printf("The first %d fibonacci series is :\n ", num);
    printf("%d\n", fib1);
    printf("%d\n", fib2);
    cnt = 2;

    while (cnt < num)
    {
        fib3 = fib1 + fib2;
        cnt++;
        printf("%d\n", fib3);
        fib1 = fib2;
        fib2 = fib3;
    }

    return 0;
}