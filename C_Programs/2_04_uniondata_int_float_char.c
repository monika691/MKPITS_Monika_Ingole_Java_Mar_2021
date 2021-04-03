//create a union data having int , float and char array.

#include<stdio.h>
#include<string.h>

union data
{
    int i;
    float j;
    char k[20];
};

int main()
{
    union data d1;
    d1.i=22;
    printf("value of i=%d\n",d1.i);
    d1.j=22.54;
    printf("value of j=%f\n",d1.j);
    strcpy(d1.k,"amit");
    printf("value of k =%s\n",d1.k);
    return 0;
}