// 6- wap to create character array of 10 elements and store some value in it.
// and then display each character in a new line;

#include<stdio.h>

int main(){
    char name[10]="monika";
    int cnt;
    for(cnt=0;cnt<10;cnt++){
         printf(" %c\n",name[cnt]);
    }return 0;
}