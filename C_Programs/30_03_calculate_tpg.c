//create function 
	//create function 
	//a- calculatetotal(int sub1,int sub2,int sub3)
	//b - calculatepercentage(int total)
	//c- calculategrade(float per)

#include<stdio.h>
void calculatetotal(int sub1,int sub2,int sub3){
    int total =sub1+sub2+sub3;
    printf("total marks =%d\n",total);
    calculatepercentage(total);
}
void calculatepercentage(int total){
    double per;
    per = (float)(total/300.0f)*100.0f;
    printf("percentage is =%lf\n",per);
    calculategrade(per);
}
void calculategrade(double per){
    printf("percentage = %lf\n",per);
    if (per>=75){
        printf("grade : distinction\n");
    }else if(per>60 && per<75){
        printf("grade : first class\n");
    }else if("per>40 && per<60"){
        printf("grade: secound class\n");
    }else{
        printf("fail\n");
    }
}
int main(){
    int sub1,sub2,sub3;
    printf("enter 3 subject marks\n");
    scanf("%d%d%d",&sub1,&sub2,&sub3);
    calculatetotal(sub1,sub2,sub3);
    printf("back to main function\n");
    return 0;
}
