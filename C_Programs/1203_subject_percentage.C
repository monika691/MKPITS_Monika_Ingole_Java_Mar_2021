#include<stdio.h>
#include<conio.h>
void main(){
int m1,m2,m3,total;
float per;
clrscr();
printf("enter 3 subject marks\n");
scanf("%d %d %d",&m1,&m2,&m3);
total=m1+m2+m3;
 printf("total =%d\n",total);
  per =(float) (total/300.0f)*100.0f;
 printf("percentage is %f",per);

getch();
}