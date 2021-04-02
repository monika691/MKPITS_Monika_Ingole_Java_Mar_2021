// 50_40whileloop.cpp : This file contains the 'main' function. Program execution begins and ends there.
//- wap to print no. from 50 to 40 using while loop.

#include <stdio.h>

int main()
{
	int cnt = 50;
	while (cnt >= 40) {
		printf("\n%d", cnt);
		cnt = cnt - 1;
	}



	return 0;
}

