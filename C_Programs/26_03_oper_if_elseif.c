// operatorifelseif.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <stdio.h>

int main()
{
	int num1, num2, res;
	char ch = 'y';
	char oper;

	do {
		printf("Enter the 2 number\n");
		scanf("%d%d", &num1, &num2);

		printf("Enter operator +,-,*,/\n");
		fflush(stdin);
		scanf(" %c",&oper);
		res = 0;

		if (oper == '+') 
			res = num1 + num2;
		
		else if (oper == '-') 
			res = num1 - num2;
		
		else if (oper == '*') 
			res = num1 * num2;
		
		else if (oper == '/') 
			res = num1 / num2;
		
		else 
			printf("\n invalid operator entered");
		
		printf(" result = %d\n", res);
		
		printf("Do you want to continue press y or n\n");4
		scanf(" %c", &ch);
		}

	while (ch == 'y');
		printf("\nBye");

	     
	    return 0;
        }