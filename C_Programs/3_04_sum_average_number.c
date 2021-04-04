//16. Write a program in C to read 10 numbers from keyboard and find their sum and average. 

#include<stdio.h>

int main(){
    int num,sum=0,cnt;
    float avg;
    for(cnt=1;cnt<=10;cnt++)
    {
        printf("enter number\n");
        scanf("%d",&num);
       sum =sum +num;
    }
    printf("sum of number = %d\n",sum);
    avg = sum /10;
    printf("average =%d\n",avg);
    return 0;
}