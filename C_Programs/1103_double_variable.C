#include<stdio.h>
#include<conio.h>

void main(){
 int length,breadth,area;
 clrscr();
 printf("enter the length\n");
 scanf("%d",&length);
 printf("enter the breadth\n");
 scanf("%d",&breadth);
 area = length * breadth;
 printf("area of rectangle is %d",area);


getch();
}