//7 wap to accept 5 subject marks using for loop calculate total, per, grade.

#include<stdio.h>

int main(){
    int sub,cnt,total=0;
    float per;
    char grade;
    for(cnt=1;cnt<=5;cnt++){
        printf("Enter 5 subject marks\n");
        scanf("%d",&sub);
        total = total + sub;
    }printf("total marks = %d\n",total);
    per = (float)(total/500.0f)*100.0f;
    printf("percentage are %f\n",per);
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