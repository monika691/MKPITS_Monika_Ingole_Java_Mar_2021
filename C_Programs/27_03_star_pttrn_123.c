// 22 wap to print the pattern as given below
// 	*	
// 	*	*
// 	*	*	*



#include<stdio.h>

int main(){
    int rowcount,columncount;

    for(rowcount =1;rowcount<=3; rowcount++){

        for(columncount =1 ;columncount <=rowcount;columncount++){
            printf("*\t");
        }printf("\n");
    }
    return 0;
}