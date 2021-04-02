//wap to accept a number and exit if user entered a number 5 using do while loop.

#include<stdio.h>

int main() {
	int num;
	do {
		printf("Enter number\n");
		scanf("%d", &num);
		printf("number = %d\n",num);
	} while (num != 5);

	return 0;
}