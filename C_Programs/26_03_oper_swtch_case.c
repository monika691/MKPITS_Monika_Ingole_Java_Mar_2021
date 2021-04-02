// operatorswtch case.cpp : This file contains the 'main' function. Program execution begins and ends there.
///WAP TO ACCEPT 2 NO. AND OPERATOR (+, - , * \ ) FROM THE USER AND PRINT THE RESULT(USE switch case)




#include <stdio.h>

	int main()
	{
		int num1, num2;
		float res;
		char oper;
printf("Enter the 2 number\n");
scanf("%d%d", &num1, &num2);

printf("Enter operator +,-,*,/\n");
scanf(" %c", &oper);
switch(oper)
	{
		case '+':
	res = num1 + num2;
	break;
	case'-':
	res = num1 - num2;
	break;
	case '*':
	res = num1 * num2;
	break;
	case '/':
	res = num1 / num2;
	break;
	
	default:
	printf("invalid operator\n");
	}	printf("total number is %.2f\n",res);	
	return 0;
}


