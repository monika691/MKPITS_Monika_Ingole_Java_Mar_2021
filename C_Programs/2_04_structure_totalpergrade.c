//7 create a structure student having members rno,name ,marks1,marks2 ,marks3 ,total, percentage
//calculate total , percentage and grade.
#include<stdio.h>
#include<string.h>


int main()
{
    struct student
{
    int rollno;
    int marks;
    int total;
    char name[20];
    float per;
}stud1;
        printf("Enter roll no.\n");
        scanf("%d",&stud1.rollno);
        rintf("Enter name\n");
        scanf("%s",&stud1.name);
        rintf("Enter  3 smarks\n");
        scanf("%d%d%d",&stud1.rollno,&stud1.rollno,&stud1.rollno);
        
stud1.total =stud1.total+stud1.marks;
   printf("total=%d\n",stud1.total);
  
   stud1.per = (float)(stud1.total/300.0f)*100.0f;
   printf("per=%f\n",stud1.per);

   if(per>75)
   {
       printf("grade:distinction\n");
   }else if(per>=60 && per<75)
   {
       printf("grade:first class\n");
   }else if(per>=40 && per <60)
   {
       printf("grade:secound class\n");
   }else{
       printf("fail\n");
   }
   
   
   
    return 0;
}