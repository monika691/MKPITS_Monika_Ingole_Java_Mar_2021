//create a function checkprimeno(int num) to check and display wheter the number is prime or not.

#include<stdio.h>
void displayprimeno(int num){
    int cnt=2,rem=0;
    while(cnt<num){
        rem = num % cnt;
        if(rem==0){
            break;
        } cnt++;
    }
        if(cnt == num){
            printf("%d is prime number\n");
        }
        else{
            printf("num is not a prime number\n");
        }
    
}
int main(){
    int num;
    printf("enter number\n");
    scanf("%d",&num);

    displayprimeno(num);
    return 0;
}