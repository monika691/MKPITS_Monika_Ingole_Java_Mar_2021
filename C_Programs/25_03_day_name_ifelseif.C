//WAP TO ACCEPT DAYNO AND PRINT DAYNAME USING IF ELSE IF.

#include<stdio.h>

int main()
{
int dayno;
printf("Enter number between 1 and 7\n");
scanf("%d",&dayno);
if(dayno==1){
printf("its monday\n");
}
else if(dayno==2){
printf("its tuesday\n");
}
else if(dayno==3){
printf("its wednesday\n");
}
else if(dayno==4){
printf("its thursday\n");
}
else if(dayno==5){
printf("its friday\n");
}
else if(dayno==6){
printf("its saturday\n");
}
else if(dayno==7){
printf("its sunday\n");
}
return 0;
}