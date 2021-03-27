// buisnessdone.c.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <stdio.h>

int main()
{
int numofyrs;
long int bizdone;
	printf("Enter number of years\n ");
	scanf("%d", &numofyrs);

	printf("Enter business done\n");
	scanf("%ld", &bizdone);

	if (numofyrs > 10) {
		if (bizdone >= 5000000) {
			printf("you are most valuable\n");
		}
		else {
			printf("little more effort required");
		}
	}
		return 0;
	}




