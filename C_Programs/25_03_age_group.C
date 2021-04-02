//- wap to accept age from the user and display whether he is young, middleaged or old.(if elseif )

#include<stdio.h>


int main()
{
 int age;

 printf("Enter your age\n");
 scanf("%d",&age);

 if(age>=15 && age<=25)
 {
     printf(" %d you are young\n",age);
 }
  else if(age>25 && age<=65)
  {
     printf(" you are middleaged\n");
 }
  else 
     printf(" you are old\n");

return 0;
}