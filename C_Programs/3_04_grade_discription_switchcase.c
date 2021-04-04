// 9 Write a program in C to accept a grade and declare the equivalent description : 
// Grade 	Description
// E 	Excellent
// V 	Very Good
// G 	Good
// A 	Average
// F 	Fail

#include<stdio.h>

int main(){
    char ch;
    printf("Enter any chracter(E,V,G,A,F)\n");
    scanf("%c",&ch);

    switch(ch)
    {
        case 'E':
        printf("Excellent\n");
        break;

        case 'V':
        printf("Very Good\n");
        break;

        case 'G':
        printf("Good\n");
        break;

        case 'A':
        printf("Average\n");
        break;

        case 'F':
        printf("Fail\n");
        break;

        default:
        printf("Invalid character\n");
    }
    return 0;
}