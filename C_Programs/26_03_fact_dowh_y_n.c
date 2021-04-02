// factdowhileloop.cpp : This file contains the 'main' function. Program execution begins and ends there.
// ACCEPT A NUMBER AND PRINT FACTORAIL OF A NUMBER AND REPEAT ASKING A NUMBER till USER PRESSES 'y' 
//WHEN THE PROGRAM ASK "DO YOU WANT TO CONTINUE"  ;

#include <stdio.h>

int main()
{
	char ch = 'y';
	int num, fact = 1;

	do
	{
		printf("Enter number\n");
		scanf("%d", &num);

	 while (num > 0)

	{
		fact = fact * num;
		num--;
	}
		printf(" factorial of number = %d\n", fact);

		printf(" Do you want to continue press y or n\n");
		scanf(" %c", &ch);
	}
	while (ch == 'y');
	printf(" \nbye");

	return 0;
}