#include<stdio.h>

int main(){
    int s1,s2,s3,total;
    float per;

    printf("Enter 3 subject marks\n");
    scanf("%d%d%d",&s1,&s2,&s3);
 total =s1+s2+s3;
 per =(float)(total/300.0f)*100.0f;

 printf("total marks out of 300 is %d\n",total);
 printf("percentage = %f\n",per);

 if(per >=75 && per <100){
     printf("grade : distinction \n");
 }else if(per >=60 && per <75){
     printf("grade : first division \n");
 }else if(per >=40 && per <60){
     printf("grade : secound division \n");
 }else
 printf("you are failed\n");
    return 0;
}