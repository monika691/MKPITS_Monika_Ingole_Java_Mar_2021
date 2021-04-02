//4 -create a 2 d array of 4 rows and 5 column

#include<stdio.h>

int main(){
    int num[4][5];
    int row,col;

    for(row=0;row<4;row++)
    {
        for(col=0;col<5;col++)
        {
            printf("Enter number\n");
            scanf("%d",&num[row][col]);
        }
    }
        for(row=0;row<4;row++)
    {
        for(col=0;col<5;col++)
        {
            printf("%d\t",num[row][col]);
        }
        printf("\n");
    }
    return 0;
}