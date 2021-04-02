//wap to accept 3 numbers from the user and display the greater numbers(if elseif ...)

#include<stdio.h>

int main()
{ 
     int n1,n2,n3;
printf("Enter 3 numbers\n");
scanf("%d%d%d",&n1,&n2,&n3);

if(n1>=n2 && n1>=n3){
printf("%d is greater\n",n1);
}
else if(n2>=n1 && n2>=n3) {
printf("%d is greater\n",n2);
}
else
printf("%d is greater\n",n3);
 
 return 0;
}