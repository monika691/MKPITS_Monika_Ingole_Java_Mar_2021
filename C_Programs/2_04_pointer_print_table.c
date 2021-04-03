//8 create a function to print table of number using pointer.

#include<stdio.h>
void calculate(int *num)
{
    int a ,op;
    for(a=1;a<=10;a++)
    {
    op=a**num;
    printf("%d\t*%d\t=%d\n",*num,a,op);
    
    }
}
int main()
{
    int num;
    int op;
   
    printf("Enter number:\n");
    scanf("%d",&num);

    calculate(&num);
    
    return 0;
}