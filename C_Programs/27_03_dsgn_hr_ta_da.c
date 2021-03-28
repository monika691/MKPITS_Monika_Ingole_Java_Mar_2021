#include<stdio.h>

int main(){
    int empno;
    char empname[20];
    float basic_sal,hra,ta,da,total_sal;

    printf("Enter empno\n");
    scanf("%d",&empno);

    printf("Enter empname\n");
    scanf("%s",&empname);

    printf("Enter basic salary\n");
    scanf("%f",&basic_sal);

    hra = basic_sal * 0.15f;
    da = basic_sal * 0.25f;
    ta = basic_sal * 0.55f;

    total_sal = basic_sal + hra + da + ta;

    printf("-------------------------------------------------------------------------------------------------------------\n");
    printf("empno\t empname \t basic_sal \t hra \t da \t\t ta \t\t total_sal\n");
    printf("--------------------------------------------------------------------------------------------------------------\n");
    printf("%d \t %s \t\t %.2f \t %.2f \t  %.2f \t  %.2f \t %.2f \n",empno, empname, basic_sal, hra,da,ta,total_sal);
    printf("---------------------------------------------------------------------------------------------------------------\n");
    return 0;
}