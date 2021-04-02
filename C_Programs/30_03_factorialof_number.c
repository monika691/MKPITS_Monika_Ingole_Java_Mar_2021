//- create a function calculatefactorial(int num) to  calculate and display factorial of a number.

#include<stdio.h>
int calculatefactorial(int num){
int fact=1;
do{


    fact = fact * num;
    num =num -1;
 }while(num!=0);
 return fact;   
}
int main(){
    int num,res;
    
    printf("enter number\n");
    scanf("%d",&num);

    res = calculatefactorial(num);
    printf("factorial of number =%d\n",res);

    printf("back to main function\n");
    return 0;
}