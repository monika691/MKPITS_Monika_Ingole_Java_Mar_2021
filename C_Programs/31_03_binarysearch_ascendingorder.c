//-wap to create array 10 elements accept 10 no. from the user and store it in an array
// then accept a no. from the user to search in an array.by Binary search)

#include <stdio.h>

int main()
{
    int num[10] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int low = 0, high = 9, mid, notosearch;
    printf("Enter no to be searched\n");
    scanf("%d", &notosearch);

    while (low <= high)
    {
        mid = (low + high) / 2;
        if (num[mid] == notosearch)
        {
            printf("no.%d found at position = %d\n", notosearch, num[mid]);
            break;
        }
        else
        {
            if (num[mid] < notosearch);
              low = mid + 1;

            if (num[mid] > notosearch);
                high = mid - 1;
        }
    }
    if (low > high)
    {
        printf("no.not found in an array\n");
    }

    return 0;
}