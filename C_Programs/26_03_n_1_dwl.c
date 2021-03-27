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