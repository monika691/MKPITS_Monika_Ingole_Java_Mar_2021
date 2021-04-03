//create a structure employee having members name,gender and age.

#include<stdio.h>
#include<string.h>
struct employee
{
    char name[10];
    char gender;
    int age;
};

int main()
{
    struct employee emp1;
    strcpy(emp1.name,"monika");
    emp1.gender='f';
    emp1.age=29;

    printf("name=%s\n",emp1.name);
    printf("gender=%c\n",emp1.gender);
    printf("age=%d\n",emp1.age);
    return 0;
}