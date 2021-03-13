#include<stdio.h>
#include<conio.h>

void main(){
 float bs,ts,hra,da,ta;
 //hra=17%, da=28%, ta=56%,
 //bs-->basic salary, ts-->total salary
 clrscr();
   printf("enter basic salary\n");
   scanf("%f",&bs);
   hra=(bs*17)/100;
   printf("hra =%f\n",hra);

   da =(bs*28)/100;
   printf("da=%f\n",da);

   ta= (bs*56)/100;
   printf("ta = %f\n",ta);

   ts=bs+hra+da+ta;
   printf("total salary =%f\n",ts);


getch();
}