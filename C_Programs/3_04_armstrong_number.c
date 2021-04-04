// 1 Write a C program to check whether a given number is an armstrong number or not. 
// Input a number: 153
// Expected Output :
// 153 is an Armstrong number.

#include<stdio.h>

int main(){
    int num,r,sum=0,temp;
    printf("enter number\n");
    scanf("%d",&num);
    for(temp=num;num !=0;num=num/10)
    {   r = num %10;
        sum=sum+(r*r*r);
    }if(sum==temp)
    {
        printf("it is armstrong number\n");
    }else{
        printf("it is not armstrong no.\n");
    }
    return 0;
}