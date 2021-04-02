// 5childrenage.cpp : This file contains the 'main' function. Program execution begins and ends there.
//wap to accept age of 5 student calculate and display the average age using while loop

#include <stdio.h>

int main()
{
	int age, total = 0;
	int cnt = 1;
	float avg;
	while (cnt <= 5) {
		printf("Enter %d children age\n", cnt);
		scanf("%d", &age);
		total = total + age;
		cnt = cnt + 1;
	}
	printf("\n total age is = %d", total);
	avg = (float)(total / 5.0f);
	printf("\n Average age is %f", avg);


	return 0;
}
