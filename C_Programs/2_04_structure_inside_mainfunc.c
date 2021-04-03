//2- structure declared inside main function


#include<stdio.h>
#include<string.h>

int main(){
    struct employee 
    {
        char name[10];
        char gender;
        int age;
    };
    struct employee emp1;
    strcpy(emp1.name,"monika");
    emp1.gender='f';
    emp1.age=27;

    printf("name=%s\n",emp1.name);
    printf("gender=%c\n",emp1.gender);
    printf("age=%d\n",emp1.age);
    return 0;
}