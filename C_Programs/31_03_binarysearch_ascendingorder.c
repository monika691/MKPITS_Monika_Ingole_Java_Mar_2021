//-wap to create array 10 elements accept 10 no. from the user and store it in an array
// then accept a no. from the user to search in an array.by Binary search)enter number in asending order

#include <stdio.h>

int main()
{
    int num[10];
    int cnt, nts;
    int low = 0, high = 9, mid;
    for (cnt = 0; cnt < 10; cnt++)
    {
printf("Enter any number:\n");
scanf("%d",&num[cnt]);
    }
        printf("Enter no to be searched\n");
        scanf("%d", &nts);
    
    while (low <= high)
    {
        mid = (low + high) / 2;
        if (num[mid] == nts)
        {
            printf("no.%d is found at position = %d\n", nts, mid);
            break;
        }
        else
        {
            if (num[mid] < nts)
            {
                low = mid + 1;
            }
            if (num[mid] > nts)
            {
                high = mid - 1;
            }
        }
    }
    if (low > high)
    {
        printf("no.not found in an array\n");
    }

    return 0;
}