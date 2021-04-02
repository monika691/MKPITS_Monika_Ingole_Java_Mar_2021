//7 WAP TO ACCEPT GRADE (E OR M ) AND EXP AND  CALCULATE SALARY.

#include<stdio.h>

int main(){
    char grade;
    int exp;
    int salary =0;
    printf("Enter grade e or m\n");
    scanf("%c",&grade);
    printf("Enter experience 1 ,2 or 3\n");
    scanf("%d",&exp);

    switch(grade)
    {
    case 'e':
        if(exp>=2)
        salary =2000;
        else
        salary=1000;
        break;
 case'm':
        if(exp>=2)
        salary=4000;
        else
        salary=3000;
        break;
default :
        printf("invalid input\n");
    }printf("salary =%d\n",salary);
    return 0;
}