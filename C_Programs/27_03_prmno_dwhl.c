#include<stdio.h>

int main(){
    int num,cnt =2,rem=0;
    
    printf("Enter number\n");
    scanf("%d",&num);
    do{
           rem = num % cnt;
           if(rem == 0){
               break;
           }cnt++;
                   
    }
    while (cnt < num);
    if(cnt == num){
        printf("number is prime \n");
    }else {
        printf("number is not prime");
    }
    
    return 0;
}