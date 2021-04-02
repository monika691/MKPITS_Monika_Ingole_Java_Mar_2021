// function not returning any value and with parameters.
// 3 - create a function calculate with 2 integer parameters and calculate and display the addition of 2 no.

#include<stdio.h>
void calculate(int n1,int n2){

    int sum = n1 +n2;
    printf("sum of two number = %d\n",sum);
}
int main(){
    int num1,num2;
    printf("enter number\n");
    scanf("%d%d",&num1,&num2);
    calculate (num1,num2);
    printf("back to main function\n");
    return 0;
}