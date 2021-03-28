// totalsalarydowhile.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <stdio.h>

int main()
{
	int salary;
	int total=0;
	int cnt = 1;
	do {
	printf("Enter %d salary\n",cnt);
	scanf(" %d", &salary);
		total = total + salary;
		cnt++;
	}while (cnt <= 5);
	     printf("total salary is:%d\n",total);
		
	
	return 0;
}