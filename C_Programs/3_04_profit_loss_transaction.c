//7 Write a C program to calculate profit and loss on a transaction.


#include<stdio.h>

int main(){
    int cp,sp,amt;

    printf("Enter cost price\n");
    scanf("%d",&cp);

    printf("Enter selling price\n");
    scanf("%d",&sp);

    if(sp > cp)
    {    
        amt = sp - cp;
        printf("profit = %d\n",amt);
    } else if(cp > sp)
    {
        amt = cp - sp;
        printf("loss = %d\n",amt);
    }else{
        printf("no profit no loss\n");
    }
    return 0;
}