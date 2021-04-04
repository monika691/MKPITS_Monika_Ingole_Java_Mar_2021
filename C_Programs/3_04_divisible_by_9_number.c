// 30 Write a program in C to find the number and sum of all integer between 100 and 200 which are divisible by 9.
// Numbers between 100 and 200, divisible by 9 :
// 108 117 126 135 144 153 162 171 180 189 198
// The sum : 1683 



#include<stdio.h>

int main(){
   int n,sum=0;
   printf("Enter the numbers between 100 and 200 divisible by 9\n");
   for(n=101;n<=200;n++)
   {
       if(n%9==0)
       {
           printf("%d\n",n);
           sum+=n;
       }
   }printf("The sum = %d\n",sum);
    return 0;
}


