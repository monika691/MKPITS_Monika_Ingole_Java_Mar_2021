//19 wap to print the pattern as given below
	1	2	3
	1	2	3
	1	2	3



#include<stdio.h>

int main(){
    int rowcount,columncount;

    for(rowcount = 1; rowcount <=3; rowcount++){

        for(columncount =1;columncount <=3;columncount++){

            printf("%d\t",columncount);
        }printf("\n");
    }
    return 0;
}