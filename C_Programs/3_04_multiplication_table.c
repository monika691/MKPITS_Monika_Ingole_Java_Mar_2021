//18.  Write a program in C to display the multiplication table of a given integer. 

#include<stdio.h>

int main(){
    int num,cnt,res=1;
    printf("Enter number\n");
    scanf("%d",&num);
printf("table of number =%d\n",num);
printf("----------------------------------------\n");
    for(cnt=1;cnt<=10;cnt++)
    {
        res = num * cnt;
        printf("%d * %d = %d\n",num,cnt,res);
    }
    
    return 0;
}