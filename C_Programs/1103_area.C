#include<stdio.h>
#include<conio.h>

void main(){
 int length,breadth,height,volume;
clrscr();
printf("enter length,breadth,height\n");
scanf("%d %d %d",&length,&breadth,&height);
 volume = length*breadth*height;
 printf("volume = %d\n",volume);



getch();
}