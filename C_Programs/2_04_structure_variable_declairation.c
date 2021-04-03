//3- structure variable declaration

#include <stdio.h>
#include <string.h>

int main()
{
    struct employee
    {  
       char name[10];
       char gender;
       int age;
    } emp1;

    strcpy(emp1.name,"parmi");
    emp1.gender='f';
    emp1.age=6;
    printf("name=%s\n",emp1.name);
    printf("gender=%c\n",emp1.gender);
    printf("age=%d\n",emp1.age);

    
    return 0;
}