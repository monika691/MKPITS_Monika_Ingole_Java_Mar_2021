//example of pass by value 

#include<stdio.h>
void changevalue(int num){
    num =num + 5;
    printf("value inside function =%d\n",num);
}

int main(){
    int num =5;
    printf("value before passing function =%d\n",num);
    changevalue(num);
    printf("value after calling function= %d\n",num);
    return 0;
}