//5 wap to accept empname , designation and salary and then display it.

#include<stdio.h>

int main(){
    char empname[20],designation[20];
    double salary;

    printf("Enter employee name\n");
    scanf("%s",&empname);

    printf("Enter designation\n");
    scanf("%s",&designation);

    printf("Enter salary\n");
    scanf("%lf",&salary);

    printf("employee name is %s\n",empname);
    printf("employee designation is %s\n",designation);
    printf("employee salary is %lf\n",salary);
    return 0;
}