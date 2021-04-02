// 13 -wap to create array 10 elements accept 10 no. from the user and store it in an array
// then accept a no. from the user to search in an array.(linear search)

#include<stdio.h>

int main(){
    int num[10]={1,2,3,4,5,6,7,8,9,10};
    int cnt;
    int usernumber;

    printf("Enter number to be serched in an array\n");
    scanf("%d",&usernumber);

    for(cnt=0;cnt<10;cnt++)
    {
        if(usernumber == num[cnt])
        {
            printf("no.%dfound in an array at position : %d\n",usernumber,cnt);
            break;
        }
        if(cnt == 10)
        {
            printf("no.not found in an array\n");
        }
    }
    return 0;
}