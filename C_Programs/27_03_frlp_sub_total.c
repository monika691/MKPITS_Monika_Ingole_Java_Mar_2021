#include<stdio.h>

int main(){
    int sub,total=0;
    int cnt;
    for(cnt=1;cnt<=5;cnt++){
        printf("Enter marks\n");
        scanf("%d",&sub);
        total = total + sub;
    }printf("total of subject is %d\n",total);
    return 0;
}