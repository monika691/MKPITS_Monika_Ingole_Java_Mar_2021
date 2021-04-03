//4 -declaing two structure variables

#include<stdio.h>
#include<string.h>

int main()
{
    struct employee
    {
        char name[10];
        char gender;
        int age;
    }emp1,emp2;

    strcpy(emp1.name,"nilima");
    emp1.gender='f';
    emp1.age=26;
    printf("name=%s\n",emp1.name);
    printf("gender=%c\n",emp1.gender);
    printf("age=%d\n",emp1.age);

    strcpy(emp2.name,"amit");
    emp2.gender='m';
    emp2.age=22;
    printf("name=%s\n",emp2.name);
    printf("gender=%c\n",emp2.gender);
    printf("age=%d\n",emp2.age);

    return 0;
}