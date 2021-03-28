#include<stdio.h>

int main(){
    int num,cnt=2,rem =0;

    printf("Enter number\n");//5
    scanf("%d",&num);

    while(cnt < num)
    {
        rem = num % cnt;//5 % 2=1, 5%3=2,

        if(rem == 0){
            break;
        } cnt ++;  //2 + 1 = 3,3+1=4
    }
    if (cnt == num){
        printf("it is prime no.\n");
    }  
    else{   
        printf("it is not prime no.");
    }
    
    return 0;
}