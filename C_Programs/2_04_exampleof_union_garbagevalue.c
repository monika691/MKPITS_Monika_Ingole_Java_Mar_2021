//9- another example of union
#include<stdio.h>
#include<string.h>
union data
{
    int i;
    float j;
    char k[20];
};
int main(){
    union data d1;
    d1.i=22;
    d1.j=2.2;
    strcpy(d1.k,"sagar");

    // printf("value of i =%d\n",d1.i); it takes as a garbage value.
    // printf("value of j=%f\n",d1.j); union data only one datatype can work at a time:last datatype.
    printf("value of k=%s\n",d1.k);
    return 0;
}