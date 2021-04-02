//WAP TO ACCEPT GRADE (E OR M ) AND EXP AND  CALCULATE SALARY using switch inside switch.
#include<stdio.h>

int main()
{
    char grade;
    int exp;
    int salary =0;
    printf("Enter grade e or m\n");
    scanf(" %c",&grade);
    printf("Enter experience 1 or 2 \n");
    scanf("%d",&exp);

    switch(grade)
    {
    case 'e':
        switch(exp)
       {case 1 :
       salary=1000;
        break;
        case 2:
        salary =2000;
        break;
        default:
        salary=3000;
       } break;
        case'm':
        switch(exp)
       { 
      case'm':
        case 1:
        salary =2000;
        break;
        case 2:
        salary=3000;
        break;
default :
salary =4000;
       }
       
    }printf("salary =%d\n",salary);
    
    
     return 0;
   }
