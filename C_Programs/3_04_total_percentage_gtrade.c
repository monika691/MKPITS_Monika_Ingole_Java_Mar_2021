// 3 Write a C program to read roll no, name and marks of three subjects and 
// calculate the total, percentage and division

#include<stdio.h>

int main(){
    int rollno,sub,total=0,cnt;
    float per;
    char name[20],division;

    printf("Enter rollno\n");
    scanf("%d",&rollno);

    printf("Enter name\n");
    scanf("%s",&name);
for(cnt=1;cnt<=3;cnt++)
{
    printf("Enter  subject marks\n");
    scanf("%d",&sub);

    total = total + sub;
}
    printf("total marks =%d\n",total);

    per= (float)(total/300.0f)*100.0f;
    printf("percentage = %.2f\n",per);

    if (per >= 75) {
		printf("\ngrade : distinction");
	}else if (per < 75 && per>60) {
		printf("\n grade : first class");
	}
	else if (per >40 && per < 60) {
	printf("\n grade : secound division");
    }
	else
	printf("\nyou are failed");
    return 0;
}
