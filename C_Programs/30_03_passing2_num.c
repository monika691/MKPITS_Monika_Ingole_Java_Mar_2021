//function returning any value and without parameters.
#include<stdio.h>
int calculate(){

    int num1,num2,sum;
    printf("enter 2 number\n");
    scanf("%d%d",&num1,&num2);
    sum = num1 +num2;
    return sum;
}
int main(){
    int res = calculate();
printf("sum of 2 number =%d\n",res);
printf("back to main function\n");
    return 0;
}