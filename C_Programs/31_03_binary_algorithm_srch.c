//8 -wap to search an element in an array using binary search algorithm.

#include<stdio.h>

int main(){
    int num[5]={1,2,3,4,5};
    int low=0,high=4,mid,notosearch;

    printf("Enter no to be searched\n");
    scanf("%d",&notosearch);

    while(low <= high)
    {
        mid = (low+high)/2;
        if(num[mid]==notosearch)
        {
            printf("no.%d found at position %d\n",notosearch,mid);
            break;
        }
        else
        {
            if(num[mid] < notosearch);
            low =mid + 1;

            if(num[mid] > notosearch);
            high = mid -1;
        }
    }
    if(low > high)
    {
        printf("no.not found in an array\n");
    }
    return 0;
}