// 6 -WAP TO ACCEPT A CHARACTER FROM THE USER AND PRINT WHETHER IT IS VOWEL OR NOT.
// USING SWITCH CASE.



#include<stdio.h>

int main(){
    char ch;
    printf("Enter the char\n");
    scanf("%c",&ch);

    switch(ch){

        case'a':
        case'e':
        case'i':
        case'o':
        case'u':
        printf("it is vowel\n");
        break;
        default :
        printf("it is not vowel\n");

    }
    return 0;
}