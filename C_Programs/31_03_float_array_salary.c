//9 wap to create a float array 0f 10 elements to store salary of 10 employees

#include<stdio.h>

int main(){
    double salary[10];
    int cnt;

    for(cnt=0;cnt<10;cnt++)
    {
        printf("Enter salary of employee\n");
        scanf("%lf",&salary[cnt]);
    }
    for(cnt=0;cnt<10;cnt++)
    {
        printf("salary [%d]= %lf\n",cnt,salary[cnt]);
    }
    return 0;
}