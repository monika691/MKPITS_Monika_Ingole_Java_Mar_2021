//wap to accept a number and print whether it is a prime no. or not using for loop.

#include <stdio.h>

int main()
{
    int num, cnt = 2, rem = 0;

    printf("Enter number\n");
    scanf("%d", &num);
    for (cnt = 2; rem <cnt; cnt++)
    {

        rem = num % cnt;
        if (rem == 0)
        {
            break;
        }
    
    }
    if (cnt==num){
        printf("entered number is prime\n");
    }
    else{
        printf(" entered number is not prime\n");
    }
    return 0;
}