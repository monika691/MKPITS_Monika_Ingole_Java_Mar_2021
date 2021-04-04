// 29 Write a program in C to check whether a number is a palindrome or not. 
// Input a number: 121
// Expected Output :
// 121 is a palindrome number.

#include<stdio.h>

int main(){
    int n,origno,revno=0,rem;
     printf("enter number\n");
     scanf("%d",&n);
     origno=n;
     while(n!=0)
     {
         rem = n % 10;
         revno = revno * 10 + rem;
         n/= 10;
     }if(origno==revno)
     
         printf("%d is palindrome.\n",origno);
     else
         printf("%d is not palindrome.\n",origno);
     
    return 0;
}