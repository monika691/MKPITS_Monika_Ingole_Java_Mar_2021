// 5sujectmarkswhileloop.cpp : This file contains the 'main' function. Program execution begins and ends there.
//wap to accept 5 subject marks from the user and calculate total using while loop.

#include <stdio.h>

int main()
{
    int subject;
    int total = 0;
    int cnt = 1;
    while (cnt <= 5) {
        printf("Enter %d subject marks\n",cnt);
        scanf("%d", &subject);
        total = total + subject;
        cnt = cnt + 1;
    }
    printf("\ntotal of 5 subject is %d", total);
    
    return 0;
}


