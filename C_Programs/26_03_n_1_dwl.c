//WAP ACCEPT A NUMBER AND PRINT FROM 1 TO THAT NUMBER USING DO WHILE LOOP.
//WAP ACCEPT A NUMBER AND PRINT FROM 1 TO THAT NUMBER USING DO WHILE LOOP.

#include<stdio.h>

int main(){
    int i=1;
    int n;

    printf("enter n\n");
    scanf("%d",&n);
     i=n;
     do{
         printf("%d\n",i);
         i--;
     }
     while(i>=1);     
    return 0;
}