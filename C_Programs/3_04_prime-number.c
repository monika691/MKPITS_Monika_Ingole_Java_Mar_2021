//24 Write a C program to determine whether a given number is prime or not. 

#include<stdio.h>

int main(){
    int num,cnt=2,rem=0;
    printf("enter number\n");
    scanf("%d",&num);
while(cnt<num)
{
    rem = num % cnt;
    if(rem==0){
        
    break;
    }cnt++;
}
if(cnt==num)
{
    printf("it is prime no.\n");
}else{
    printf("it is not prime no.\n");
}

    return 0;
}