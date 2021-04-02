//wap to accept length and breadth of a rectangle and then print area
#include<stdio.h>

int main(){
 int length,breadth,height,volume;
printf("enter length,breadth,height\n");
scanf("%d %d %d",&length,&breadth,&height);
 volume = length*breadth*height;
 printf("volume = %d\n",volume);



return 0;
}