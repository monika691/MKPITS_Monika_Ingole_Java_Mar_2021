//wap to print the pattern as given below
//1	2	3	
//1	2
//1


#include<stdio.h>

int main(){
    int rowcount,columncount;

    for (rowcount=3;rowcount>0;rowcount--){
         
        for(columncount=1;columncount<=rowcount;columncount++){
            printf("%d\t",columncount);
            
        }printf("\n");
    }
    return 0;
}