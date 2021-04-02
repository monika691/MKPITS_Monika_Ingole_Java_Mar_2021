//10 wap to create array of 3 rows and 3 column and display the sum of all element

#include<stdio.h>

int main(){
    int num[3][3];
    int row,col,sum=0;

    for(row=0;row<3;row++);
    {
        for(col=0;col<3;col++)
        {
            printf("Enter number\n");
            scanf("%d",&num[row][col]);
        }
    }
    for(row=0;row<3;row++);
    {
        for(col=0;col<3;col++)
        {
            sum = sum +num[row][col];
        }printf("\nsum of all number in matrix : %d",sum);
    }
    return 0;
}