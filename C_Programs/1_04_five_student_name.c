//6- create a 2 d array to store 5 students name.

#include<stdio.h>

int main(){
    char name[5][20];
    int row;

    for(row=0;row<5;row++)
    {
        printf("Enter student name\n");
        scanf("%s",&name[row]);
    }
    for(row=0;row<5;row++)
    {
        printf("\nstudent name are :%s",name[row]);
    }
    return 0;
}