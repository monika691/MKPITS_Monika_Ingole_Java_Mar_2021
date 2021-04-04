// 1 Write a C program to accept the height of a person in centimeter and 
// categorize the person according to their height.

#include<stdio.h>

int main(){
    int perheight;
    printf("Enter height of person in centimeter\n");
    scanf("%d",&perheight);

    if(perheight >=180.0)
    {
        printf("The person is taller\n");
    }else if(perheight >=155.0)
    {
        printf("The person is average heighted\n");
    }else if (perheight < 150.0)
    {
        printf("The person is small heighted\n");
    }else{
        printf("abnormal height\n");
    }
    return 0;
}
