// factorialdowhileloop.cpp : This file contains the 'main' function. Program execution begins and ends there.
//- WAP TO ACCEPT A NUMBER AND PRINT FACTORAIL OF A NUMBER USING DO WHILE LOOP.

#include <stdio.h>

int main()
{
	int num,org_num;
	int fact = 1;
	
	printf("Enter number\n");
	scanf("%d", &num);
	org_num = num;
	do {
		fact = fact * num;
		num = num - 1;
		

	} while (num > 0);
	printf("factorial number %d=%d\n", org_num, fact);

	return 0;
}