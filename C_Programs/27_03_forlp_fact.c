//5 wap to accept a number and print factorial of that no. using for loop.

#include<stdio.h>

int main(){
    int num,fact=1;
    int cnt;
    printf("Enter the num\n");
    scanf("%d",&num);

    for(cnt=num;cnt>0;cnt--){
        fact= fact * cnt;
    }printf("factorial is %d\n",fact);
    return 0;
}