// 21 Write a program in C to display the pattern like right angle triangle with a number.
// The pattern like :

// 1
// 12
// 123
// 1234

#include<stdio.h>

int main(){
    int rowcount,columcount;
    for(rowcount=1;rowcount<=4;rowcount++)
    {
        for(columcount=1;columcount<=rowcount;columcount++)
        {
            printf("%d\t",columcount);
        }printf("\n");
    }
    return 0;
}