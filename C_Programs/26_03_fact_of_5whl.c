// factorialof5.cpp : This file contains the 'main' function. Program execution begins and ends there.
//-wap to accept a no. from the user and print the factorial of that number.

#include <stdio.h>

int main()
{
    int num, org_num;
    int fact=1;
    printf("Enter the number\n");
    scanf("%d", &num);
    org_num = num;
    while (num > 0) {
        fact = fact * num;
        num = num - 1;
    }
    printf("\nfactorial of number %d=%d", org_num,fact);
    return 0;
}

