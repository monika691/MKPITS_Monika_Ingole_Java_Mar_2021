//15. Write a C program to find the sum of first 10 natural numbers.

#include<stdio.h>

int main(){
    int sum=0,cnt;
    printf("first 10 natural number\n");
    for(cnt=1;cnt<=10;cnt++)
    {
        sum =sum +cnt;
        printf("%d\n",cnt);
    }
    printf("the sum is = %d\n",sum);
    return 0;
}