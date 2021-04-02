//9 EXAMPLE OF CONDITIONAL OPERATOR
#include<stdio.h>

int main(){
 int num1=10;
 int num2=30;
 int num3=0;
 num3 = (num1>num2) ? num1: num2;
 printf("num3 = %d\n",num3);

return 0;
}