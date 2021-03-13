#include<stdio.h>
#include<conio.h>

void main(){
 int s1,s2,s3,total;
 float per;
 clrscr();
 printf("enter 3 subject marks\n");
 scanf("%d %d %d",&s1,&s2,&s3);
 total =s1+s2+s3;
 printf("total of marks is %d\n",total);
 per =(total/300.0f)*100.0f;
 printf("percentage is %f\n",per);


getch();
}