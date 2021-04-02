//4- NESTED IF
// WAP TO ACCEPT NUMOFYEARSWITHUS AND BIZDONE WITH US AND DISPLAY MSG "CLASSIFIED AS MVS" 
// IF NUMOFYEARSWITHUS IS GREATER THAN 10 YEARS AND BIZDONE IS MORE THAN 5000000 OTHERWISE DISPLAY MSG "LITTE MORE EFFORT IS REQUIRED"


#include<stdio.h>

int main(){
    int numofyrs;
    long int bizdone;

    printf("Enter num of year\n");
    scanf("%d",&numofyrs);
    printf("Enter bizdone\n");
    scanf("%ld",&bizdone);

    if(numofyrs>=10){
        if(bizdone>5000000){
            printf("you are most valuable mvs\n");
        }else {
        printf("little more effort required\n");
        }
    }  else
    printf("num of yrs less than or equal to 10\n"); 
        
    
    return 0;
}