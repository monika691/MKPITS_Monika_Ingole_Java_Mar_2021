// 10_20whileloop.cpp : This file contains the 'main' function. Program execution begins and ends there.
//- wap to print no. from 10 to 20 using while loop

#include <stdio.h>

int main()
{
    int cnt = 10;
    while (cnt <= 20) {
        printf("\n%d", cnt);
        cnt = cnt + 1;
    }


    return 0;
}

