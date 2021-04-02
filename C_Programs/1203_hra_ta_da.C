//10 WAP TO ACCEPT BASIC SALARY FROM THE USER AND CALCULATE HRA(17% OF BASIC)
//, DA(28% OF BASIC) , TA(56% OF BASIC) AND TOTAL SALARY.

#include<stdio.h>

int main(){
 float bs,ts,hra,da,ta;
 //hra=17%, da=28%, ta=56%,
 //bs-->basic salary, ts-->total salary
 
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


return 0;
}