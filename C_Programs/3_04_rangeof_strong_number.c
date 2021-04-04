// 32 Write a C program to find Strong Numbers within a range of numbers.
// Input starting range of number : 1
// Input ending range of number: 200
// Expected Output :
// The Strong numbers are :
// 1 2 145 

#include<stdio.h>

int main(){
    int i,n1,sn,en,j,k,sum=0,n;
    long fact;
    printf("find strong number within range of number\n");
    printf("Enter starting range of number\n");
    scanf("%d",&sn);
    printf("Enter ending range of number\n");
    scanf("%d",&en);

    printf("The strong numbers are:\n");
    for(k=sn;k<=en;k++)
    {
        n1 = k;
        sum =0;

        for(j=k;j>0;j=j/10)
        {
            fact =1;
            for(i=1;i<=j%10;i++)
            {
                fact = fact * i;
            }sum =sum + fact;
        }if(sum==n1)
        {
            printf("%d\n",n1);
        }
    }

    return 0;
}