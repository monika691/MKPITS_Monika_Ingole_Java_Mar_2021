//if functions are created after main function then declare the prototype of function before the main function.
//7 - example of function prototype

#include<stdio.h>
int calculatetotal(int,int,int);
double calculatepercentage(int);
void calculategrade(double);

int main(){
    int sub1,sub2,sub3,total;
    double per;

    printf("enter 3 subject marks\n");
    scanf("%d%d%d",&sub1,&sub2,&sub3);

    total =calculatetotal(sub1,sub2,sub3);
    printf("total marks =%d\n",total);

    per = calculatepercentage(total);
    printf("percentage =%lf\n",per);

    calculategrade(per);
    printf("back to main function\n");
    
} int calculatetotal(int sub1,int sub2,int sub3){
    int total = sub1+sub2+sub3;
    return total;
}
double calculatepercentage(int total){
    double per;
    per = (float)(total/300.0f)*100.0f;
    return per;
}
void calculategrade(double per){

if (per>=75){
        printf("grade : distinction\n");
    }
    else if(per>=60 && per<75){
        printf("grade : first class\n");
    }
    else if("per>=40 && per<60"){
        printf("grade: secound class\n");
    }
    else {
        printf("fail\n");
        
    }
    return 0;
}