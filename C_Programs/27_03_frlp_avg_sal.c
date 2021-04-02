//8 wap to accept salary of 10 employee using for loop and then display the average salary.

#include<stdio.h>

int main(){
    int salary,total=0,cnt;
    float avg;

    for(cnt=1;cnt<=10;cnt++){
        printf("Enter  salary\n");
        scanf("%d",&salary);
        total =total + salary;

    }printf("\n total salary is = %d", total);
	avg = (float)(total / 10.0f);
	printf("\n Average salary is %.2f", avg);

    return 0;
}