//5 create a function cal to check whether the no. is prime or not using pointer

#include <stdio.h>
void prime(int num, int *a)
{
    int rem;
    while (*a < num)
    {
        rem = num % *a;
        if (rem == 0)
            break;
        *a = *a + 1;
    }
}
int main()
{
    int num;
    int cnt = 2;

    printf("Enter number\n");
    scanf("%d", &num);

    prime(num, &cnt);
    if (cnt == num)
    {
        printf("number is prime no.\n");
    }
    else
    {
        printf("not a prime no.\n");
    }
    return 0;
}