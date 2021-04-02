//10 wap to create  a array of 5 element then multiply the elements of array and then display it.

#include<stdio.h>

int main(){
    int num[5]={5,6,7,6,8};
    int cnt,mul=1;
    for(cnt=0;cnt<5;cnt++)
    {
        mul = num[cnt]*mul;
    }
    
        printf("Multiplication of all numbers in array:%d",mul);
    

    return 0;
}