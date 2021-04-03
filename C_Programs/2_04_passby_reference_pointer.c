//2 - create a program to explain pass by reference  using pointer

#include<stdio.h>
#include<string.h>

changenum(int*ptr)
{
    *ptr=77;
    printf("value inside function =%d\n",*ptr);
}

int main(){
    int num=66;
    printf("value before passing to function=%d\n",num);
    changenum(&num);
    printf("value after calling function =%d\n",num);
    return 0;
}