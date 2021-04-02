//8 wap to do multiplication of 2 matrix into 3 matrix of 2d array of 3 rows and 3 column.

#include<stdio.h>

int main(){
    int arr1[3][3]={{1,2,3},{4,5,6},{7,8,9}};
    int arr2[3][3]={{9,8,7},{6,5,4},{3,2,1}};
    int arr3[3][3];
    int row,col;
     for(row=0;row<3;row++)
     {
         for(col=0;col<3;col++)
         {
             arr3[row][col]=arr1[row][col]*arr2[row][col];
         }
     }
     for(row=0;row<3;row++)
     {
         for(col=0;col<3;col++)
         {
             printf("%d\t",arr3[row][col]);
         }printf("\n");
     }
    return 0;
}