// 26 Write a program in C to find the prime numbers within a range of numbers.
// Input starting number of range: 1
// Input ending number of range : 50
// Expected Output :
// The prime number between 1 and 50 are :
// 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47

#include<stdio.h>

int main()
{
    int i,j;

    for(i=2;i<50;i++)
    {  
         for(j=2;j<=i;j++)
    {
        if( i == j)
        printf("%d\n",i);
        else if (i%j == 0)
        break;
    }
        
    }                
        
    return 0;
}