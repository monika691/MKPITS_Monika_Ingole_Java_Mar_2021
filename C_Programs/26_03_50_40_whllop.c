// 50_40whileloop.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

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

