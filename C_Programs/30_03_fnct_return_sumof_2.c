// function returning a value and with parameters
// 	4- create a function calcualte with 2 int parameters and return the sum of 2 no.

#include<stdio.h>
int calculate (int n1, int n2){
    int sum = n1 + n2;
    return sum;
}


int main(){
    int num1,num2,res;
    printf("enter 2 number\n");
    scanf("%d%d",&num1,&num2);

    res=calculate(num1,num2);
    printf("sum of 2 number is =%d\n",res);
    printf("back to main function\n");
    return 0;
}