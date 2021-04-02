// 11 wap to accept rollno, studentname, marks of 5 subject(in an array)
// then display total,per,grade.

#include<stdio.h>

int main(){
    int rollno,marks[5];
    int total=0,cnt;
    float per;
    char name[20];


printf("Enter roll no. of student\n");
scanf("%d",&rollno);

printf("Enter student name\n");
scanf("%s",&name);

for(cnt=0;cnt<5;cnt++){
printf("Enter marks of 5 subject\n");
scanf("%d",&marks[cnt]);
total = total +marks[cnt];
}
printf("total marks =%d\n",total);
 per = (float)(total/500.0f)*100.0f;
 printf("percentage = %f\n",per);

if(per>=75)
{
    printf("grade:distinction\n");
}else if(per>=60 && per <75)
{
    printf("grade : first class\n");
}
else if(per>=40 && per<60)
{
    printf("grade : secound class\n");
}else {
    printf("fail\n");
}
    return 0;
}