// 20. Write a program in C to display the pattern like right angle triangle using an asterisk.
// 	The pattern like :
// *
// **
// ***
// ****

#include<stdio.h>

int main(){
    int rowcount,columcount;
    for(rowcount=1;rowcount<=4;rowcount++)
    {
        for(columcount=1;columcount<=rowcount;columcount++)
        {
            printf("*\t");
        }printf("\n");
    }
    return 0;
}