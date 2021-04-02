//1- wap to sort the elements in an array

#include<stdio.h>

int main(){
    int arr[5]={5,3,1,4,2};
    int i,j,temp=0;

    for(i=0;i<5;i++)
    {
        for(j=i+1;j<5;j++)
        {
            if(arr[i]>arr[j])
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }for(i=0;i<5;i++)
    {
        printf("%d\t",arr[i]);
    }
    return 0;
}