#include<stdio.h>
#include<conio.h>
void main(){
 float radius,area,circum;
 clrscr();
 printf("enter radius\n");
 scanf("%f",&radius);
 area =3.14*radius*radius;
 printf("area of circle is %f\n",area);
 circum = 2*3.14*radius;
 printf("circumference of circle is %f\n",circum);




getch();
}