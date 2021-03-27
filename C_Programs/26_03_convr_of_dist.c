


#include<stdio.h>

int main()
{
	float m, cm, ft, inch; int km;
	printf("enter the distance in km\n");
	scanf("%d", &km);
    m=1000*km;
	cm=100*m;
	inch=cm/2.54f;
	ft=(inch/12.0f);
    printf("\ndistance in meters=%.2f",m);
	printf("\ndistance in centimeter=%.2f",cm);
	printf("\ndistance in feet=%.2f",ft);
	printf("\ndistance in inch=%.2f",inch);

		return 0;
}
