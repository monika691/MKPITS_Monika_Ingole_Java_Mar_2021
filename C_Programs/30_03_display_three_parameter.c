//create a function calculate with 3 parameters 
// calculate ( int n1, int n2 , char op)
// and display the result . (do with without return type and with return type.)

#include<stdio.h>
int calculate(int n1,int n2,char ch){
    float res;
    if(ch == '+'){
        res = (float) n1 + n2;
        return res;
    }else if(ch == '-'){
        res = (float)n1 -n2;
        return res;
    }else if(ch == '*'){
        res = (float)n1 * n2;
        return res;
    }else if(ch == '/'){
        res =(float)n1 /n2;
        return res;
    }else{
        printf("invalid operator\n");
    }
}
int main(){
    int n1,n2;
    char ch;
    float res;
    printf("enter 2 number\n");
    scanf("%d%d",&n1,&n2);
    printf("enter operator +,-,*,/\n");
    scanf(" %c",&ch);
res = (float)calculate(n1,n2,ch);
printf("The'%c'of 2 number is: %f\n",ch,res);


    return 0;
}