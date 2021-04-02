// wap to print the pattern as given below
// 	1	3	5	
// 	1	3	5
// 	1	3	5


#include<stdio.h>

int main(){
    int rowcount,columncount;
    for(rowcount=1;rowcount<=5;rowcount=rowcount+2){

        for(columncount=1;columncount<=5;columncount=columncount+2){
            printf("%d\t",columncount);
        }printf("\n");
    }
    return 0;
}