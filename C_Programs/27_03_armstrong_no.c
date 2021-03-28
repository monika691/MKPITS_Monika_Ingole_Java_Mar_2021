#include <stdio.h>

int main()
{
    int num, r, sum = 0, temp;
    printf("Enter the number\n");
    scanf("%d", &num);
    for (temp = num; num != 0; num = num / 10)
    {
        r = num % 10;
        sum = sum + (r * r * r);
    }
    if (sum == temp)
    {
        printf("%d is amstrong number\n", temp);
    }
    else
    {
        printf("%d  is not amstrong number\n", temp);
    }
    return 0;
}