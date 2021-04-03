//6 create a function to calculate area of triangle using pointer.

#include<stdio.h>
void calculate(int *b,int *h,float *a)
{
    *a=0.5*(*b**h);
}
int main(){
    int b;
    int h;
    float a;
    printf("Enter base of triangle\n");
    scanf("%d",&b);
    printf("Enter height of triangle\n");
    scanf("%d",&h);
    calculate(&b,&h,&a);
    printf("Area of triangle is =%f\n",a);
    return 0;
}