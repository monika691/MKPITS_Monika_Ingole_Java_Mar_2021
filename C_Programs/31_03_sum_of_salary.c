//3- wap to create a array 5 element to store salary of 5 employees then sum the salary and display it.

#include<stdio.h>

int main(){
    float salary[5];
    int cnt;
    float sum =0.0f;
    float avg = 0.0f;
    
    for(cnt=0;cnt<5;cnt++){
        printf("enter salary of employee\n");
        scanf("%f",&salary[cnt]);
        sum = sum +salary[cnt];
    }printf("total salary = %f\n",sum);
    avg = sum / 5;
    printf("average =%f\n",avg);
    return 0;
}