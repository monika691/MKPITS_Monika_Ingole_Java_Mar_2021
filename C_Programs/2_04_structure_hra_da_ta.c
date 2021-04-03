//8 create a structure employee having members empno,empname,basicsalary, hra,da,ta,bonus, total salary.
// calculate hra 25% of basic
// da 35% of basic
// ta 85% of basic
// bonus =52% of basic
// totalsalary =hra+da+ta+bonus +basic.

#include<stdio.h>
#include<string.h>


struct employee
{
   char name[20];
   int no,bsal;
   } e1;

int main()
{
    printf("enter employee no,\n");
    scanf("%d",&e1.no);
    printf("Enter name\n");
    scanf("%s",&e1.name);
    printf("Enter basic salary\n");
    scanf("%d",&e1.bsal);

    float hra = e1.bsal*0.25f;
    float da = e1.bsal*0.35f;
    float ta =e1.bsal*0.85f;
    float bonus=e1.bsal*0.52f;
    float total =e1.bsal+hra+da+ta+bonus;
printf("employee no =%d\n",e1.no);
printf("employee name =%s\n",e1.name);
printf("basic salary =%d\n",e1.bsal);
printf("Total salary =%.2f\n",total);

     return 0;
}