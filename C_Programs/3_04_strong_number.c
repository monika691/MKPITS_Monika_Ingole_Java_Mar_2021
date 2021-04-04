// 31 Write a C program to check whether a number is a Strong Number or not.
// Input a number to check whether it is Strong number: 15
// Expected Output :
// 15 is not a Strong number.

#include<stdio.h>

int main(){
   int i,num,tempnum,lastdigit,sum=0;
   long fact;
   printf("Enter the number to check strong number\n ");
   scanf("%d",&num);

   tempnum=num;

   while( num > 0 )
   {
       lastdigit = num % 10;
       fact = 1;
       for(i=1;i<=lastdigit;i++)
       {
           fact = fact * i;
       }
      sum = sum +fact;
      num = num / 10;
   }
   if (sum == tempnum)
   {
       printf("%d is strong number\n",tempnum);
   }
   else{
       printf("%d is not strong number\n",tempnum);
}
    return 0;
}
