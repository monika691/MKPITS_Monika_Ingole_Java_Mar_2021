#include<stdio.h>
#include<conio.h>

void main(){
 char name[20];
 clrscr();
 printf("enter your name\n");
 scanf("%s",&name);
 printf("your name is %s\n",name);
 printf("enter your name\n");
 fflush(stdin);
 gets(name);
 printf("your name is %s\n",name);




getch();
}