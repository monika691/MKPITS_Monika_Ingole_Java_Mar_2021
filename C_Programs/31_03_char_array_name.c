//4- wap to create character array of 20 elements . accept the name of the user and store it in an array and display it.

#include<stdio.h>

int main(){
    char name[20];
    printf("Enter name\n");
    scanf("%s",&name);
    printf("your name is %s\n",name);
    return 0;
}