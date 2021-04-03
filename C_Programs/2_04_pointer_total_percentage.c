//7 create a function to total,percentage using pointers

#include <stdio.h>


void calculate (int *m1, int *m2, int *m3, int *t, float *p)
{
    *t=*m1+*m2+*m3;
    *p=(*t/300.0f)*100;
}
int main()
{
int t;
int m1,m2,m3;
float p;

printf("Enter marks1\n");
scanf("%d",&m1);
printf("Enter marks2\n");
scanf("%d",&m2);
printf("enter marks3\n");
scanf("%d",&m3);

calculate(&m1,&m2,&m3,&t,&p);

printf("total marks =%d\n",t);
printf("percentage =%.2f\n",p);
    return 0;
}