#include<stdio.h>
#include<conio.h>

void main(){
 char ch ='+';
 clrscr();
 printf("enter the character\n");
 scanf("%c",&ch);
 printf("ch = %c\n",ch);
 printf("enter new character\n");
 ch = getch();
 printf("ch=%c\n",ch);

 printf("enter new character\n");
 ch = getche();
 printf("ch = %c\n",ch);



getch();
}