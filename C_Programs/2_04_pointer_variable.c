//1- wap to create a pointer variable ptr and store the address of num variable

#include<stdio.h>
#include<string.h>

int main(){
    int num =66;
    int *ptr;
    ptr = &num;
    printf("address stored at ptr = %d\n",*ptr);
    return 0;
}

