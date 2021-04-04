// 23 Write a program in C to make such a pattern like right angle triangle with number increased by 1.
// The pattern like :

//    1
//    2 3
//    4 5 6
//    7 8 9 10

#include <stdio.h>

int main()
{
    int rowcount, columcount, cnt=1;
    for (rowcount = 1; rowcount <= 4; rowcount++)
        
    {
        for (columcount = 1; columcount <= rowcount; columcount++)
        {
            printf("%d\t", cnt);
            cnt++;
        }
        printf("\n");
    }
    return 0;
}