//3 create a function calculate to calculate area and circ using pointers

#include<stdio.h>
#include<string.h>

void calculate(int radius,float *a,float*c)
{
    *a=3.14f*radius*radius;
    *c=2*3.14f*radius;
}

int main()
{
    int radius;
    float area,cir;
    printf("Enter radius\n");
    scanf("%d",&radius);
    calculate(radius,&area,&Cir);
    printf("Area of rectangle =%f\n",area);
    printf("circ of rectangle =%f\n",cir);
    return 0;
}