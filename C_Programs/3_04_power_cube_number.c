//17. Write a program in C to display the power of the number upto given an integer.

#include<stdio.h>

int main(){
   double base,exp,res;
   printf(" enter base number\n");
   scanf("%lf",&base);

   printf("Enter exponent\n");
   scanf("%lf",&exp);

  res = pow(base,exp);
  printf("%.2lf ^ %.2lf = %.2lf\n",base,exp,res);
   return 0;
}