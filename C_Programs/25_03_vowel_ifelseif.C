#include<stdio.h>

int main()
{
char ch;
printf("Enter any charachter\n");
scanf("%c",&ch);
if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
printf("it is vowel\n");
}
else {
printf("it is not vowel\n");
}

return 0;
}