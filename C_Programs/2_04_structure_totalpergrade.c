//7 create a structure student having members rno,name ,marks1,marks2 ,marks3 ,total, percentage
//calculate total , percentage and grade.
#include <stdio.h>
#include <string.h>

struct student
{
    int rollno, m1, m2, m3;

    char name[20];

} s1;
int main()
{
    float per;
    int total;
    printf("Enter roll no.\n");
    scanf("%d", &s1.rollno);
    printf("Enter name\n");
    scanf("%s", &s1.name);
    printf("Enter  1 marks\n");
    scanf("%d",&s1.m1);
    printf("Enter  2 marks\n");
    scanf("%d",&s1.m2);
    printf("Enter  3 marks\n");
    scanf("%d",&s1.m3);

    total = s1.m1 + s1.m2 + s1.m3;
    per = (float)(total / 300.0f) * 100.0f;
    printf("rollno =%d\n", s1.rollno);
    printf("name=%s\n", s1.name);
    printf("total=%d\n", total);
    printf("per=%f\n", per);

    if (per > 75)
    {
        printf("grade:distinction\n");
    }
    else if (per >= 60 && per < 75)
    {
        printf("grade:first class\n");
    }
    else if (per >= 40 && per < 60)
    {
        printf("grade:secound class\n");
    }
    else
    {
        printf("fail\n");
    }

    return 0;
}