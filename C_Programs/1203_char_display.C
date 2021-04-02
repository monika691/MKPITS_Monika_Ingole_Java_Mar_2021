//5 PROGRAM TO ACCEPT A CHARACTER FROM THE USER AND THEN DISPLAY IT

#include<stdio.h>

int main(){
 char ch ='+';
  printf("enter the character\n");
 scanf("%c",&ch);
 printf("ch = %c\n",ch);
 printf("enter new character\n");
 ch = getch();
 printf("ch=%c\n",ch);

 printf("enter new character\n");
 ch = getche();
 printf("ch = %c\n",ch);



return 0;
}