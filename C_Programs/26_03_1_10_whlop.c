// 1_10whileloop.cpp : This file contains the 'main' function. Program execution begins and ends there.
//2- wap to print no from 1 to 10 using while loop

#include <stdio.h>

int main()
{
    int cnt = 1;
    while (cnt <= 10) {
        printf("\n%d",cnt);
        cnt = cnt + 1;
    }
    return 0;
}

