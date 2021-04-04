//19. Write a program in C to display the n terms of odd natural number and their sum  

#include<stdio.h>

int main(){
    int num,i,sum=0;
    printf("enter any intiger number\n");
    scanf("%d",&num);
    if(num > 0)
    {
        for(i=1;i<=num;i++)
        {
            if( (i%2)!=0)
            {
                sum += i;
            }
        }printf("sum of number =%d\n",sum);
    } 
     else{
        printf("Enter valid number\n");
    }
   
    
    return 0;
}