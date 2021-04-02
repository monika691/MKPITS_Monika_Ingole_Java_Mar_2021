// 2- if else 
// 1- wap to accept a number and display the message  "number is even" 
//if remainder of a number is 0 if divided by 2 else print the message "number is odd"


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