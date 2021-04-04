// 28 Write a program in C to display the number in reverse order.8Input a number: 123
// Expected Output :
// The number in reverse order is : 321

#include<stdio.h>

int main(){
    int n,rem,rev=0;

    printf("Enter number\n");
    scanf("%d",&n);

    while(n !=0)
    {
        rem = n %10;
        rev =rev*10+rem;
        n/=10;
    }   printf("reverse number=%d\n",rev); 
    return 0;
}