//4 - create a function to calculate factorial of a number using pointer

#include<stdio.h>
void calculate(int n,int*f)
{
    *f=1;
    while(n > 0)
    {
        *f = *f * n;
        n=n-1;
    }
}
int main()
{     int num;
      int fact;
      printf("Enter number\n");
      scanf("%d",&num);
      calculate(num,&fact);
      printf("factorial of number=%d\n",fact);
    
    return 0;
}