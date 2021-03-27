// 5subjectmarks.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <stdio.h>

int main()
{
	int sub, total=0;
	int cnt = 1;
	float per;
	while (cnt <= 5) {
		printf("Enter %d subject marks\n",cnt);
		scanf(" %d", &sub);
		total = total + sub;
		cnt = cnt + 1;
	}
	printf("\n total marks is = %d", total);
	per = (float) (total / 500.0f) * 100.0f;
	printf("\n your percentage is %f", per);
	if (per >= 75) {
		printf("\ngrade : distinction");85
	}else if (per < 75 && per>60) {
		printf("\n grade : first class");
	}
	else if (per >40 && per < 60) {
	printf("\n grade : secound division");
    }
	else
	printf("\nyou are failed");
    

	return 0;
}

