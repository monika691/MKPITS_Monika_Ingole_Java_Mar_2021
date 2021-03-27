#include<stdio.h>

int main(){
    int num;
    int rem=0;

    printf("Enter number\n");
    scanf("%d",&num);
    rem = num % 2;
    if(rem == 0){
        printf("num is even\n");
    }
    else
    printf("num is odd\n");
    return 0;
}