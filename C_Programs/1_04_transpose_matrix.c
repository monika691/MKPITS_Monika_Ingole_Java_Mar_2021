//9 wap to do transpose of a matrix

#include<stdio.h>

int main(){
    int mat1[3][3];
    int mat2[3][3];
    int i,j;
    for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++)
        {
            printf("Enter number\n");
            scanf("%d",&mat1[i][j]);
        }  
    }
        printf("Enter number of matrix is:\n");
        
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                printf("%d\t",mat1[i][j]);
            }printf("\n");
        }
        
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                mat2[j][i] = mat1[i][j];
            }
        }     
        
        printf("transpose  of above matrix\n");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                printf("%d\t",mat2[i][j]);
            }printf("\n");
        }
    
    return 0;
}