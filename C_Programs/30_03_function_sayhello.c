//example of 1- function not returning any value and with no parameters.

//2 - create a function sayhello to print "hello to c programming" and call this function from main function.

#include<stdio.h>

void sayhello(){

printf("\n hello to c language");
printf("\nc is the programming language");
printf("\nwe can creat function in c language\n");

}


int main(){
    sayhello();
    printf("back to main function\n");
    sayhello();
    printf("back to main function\n");
    return 0;
}