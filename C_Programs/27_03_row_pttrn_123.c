#include<stdio.h>

int main(){
    int rowcount,columncount;

    for(rowcount =1;rowcount <=3; rowcount++){

        for(columncount =1;columncount<=3 ; columncount++){
            printf("%d\t",rowcount);
        }printf("\n");
    }
    return 0;
}