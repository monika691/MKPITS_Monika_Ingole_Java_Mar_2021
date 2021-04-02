// - wap to accept length and breadth of a rectangle and then print area
#include<stdio.h>
int main()
{
    int length,breadth,area;
    printf("Enter length\n");
scanf("%d",&length);
printf("Enter breadth\n");
scanf("%d",&breadth);
area =length*breadth;
printf("Area of rectangle =%d\n",area);
return 0;
}