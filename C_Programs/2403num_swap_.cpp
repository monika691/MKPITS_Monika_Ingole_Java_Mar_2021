

#include <stdio.h>

int main()
{
	int a = 5, b = 8, c;

	printf("before swap a=%d b=%d\n",a,b);

	c = a + b;
	b = c - b;
	a = c - b;

	printf("after swap a=%d b=%d",a,b);




	return 0;
}

