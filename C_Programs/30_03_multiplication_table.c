//create a  function displaytable(int num) to display the table of that number.

#include<stdio.h>
void displaytable(int num){
    int cnt,res;
    for(cnt=1;cnt<=10;cnt++){
        res = cnt*num;
        printf("%d * %d = %d\n",num,cnt,res);
    }

}
int main(){
    int num;
    

    printf("enter number\n");
    scanf("%d",&num);
    displaytable(num);
    return 0;
}