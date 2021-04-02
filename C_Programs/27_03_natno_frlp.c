//wap to accept a number and print whether it is a natural no.

#include<stdio.h>

int main(){
    int num;
    printf("enter number\n");
    scanf("%d",&num);

    if(num>0){
        printf("it is natural number\n");
            }else {
                printf("not a natural number\n");
            }
    return 0;
}