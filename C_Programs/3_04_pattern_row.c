// 22 Write a program in C to make such a pattern like right angle triangle with a number which will repeat a number in a row. 
// The pattern like :

//  1
//  22
//  333
//  4444

#include<stdio.h>

int main(){
    int rowcount,columcount;
    for(rowcount=1;rowcount<=4;rowcount++)
    {
        for(columcount=1;columcount<=rowcount;columcount++)
        {
            printf("%d\t",rowcount);
        }printf("\n");
    }
    return 0;
}