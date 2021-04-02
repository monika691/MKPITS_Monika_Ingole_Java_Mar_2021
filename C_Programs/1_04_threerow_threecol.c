//5 create a 2 d array of 3 rows and 3 column to store decimal no.

#include<stdio.h>

int main(){
    float num[3][3];
    int row,col;
    for(row=0;row<3;row++)
    {
        for(col=0;col<3;col++)
        {
            printf("Enter any decimal number:\n");
            scanf("%f",&num[row][col]);
        }
    }
    for(row=0;row<3;row++)
    {
        for(col=0;col<3;col++)
        {
            printf("%.2f\t",num[row][col]);
        }printf("\n");
    }
    return 0;
}