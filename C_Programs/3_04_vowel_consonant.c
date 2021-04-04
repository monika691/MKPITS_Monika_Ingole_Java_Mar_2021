//6 Write a C program to check whether an alphabet is a vowel or consonant

#include<stdio.h>

int main(){
    char ch;
    char lowercase_vowel,uppercase_vowel;
    printf("Enter any alphabet\n");
    scanf("%c",&ch);

lowercase_vowel = (ch == 'a' || ch == 'e' || ch== 'i' || ch == 'o' || ch == 'u');

uppercase_vowel = ( ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U');

if(lowercase_vowel || uppercase_vowel)
{
    printf("%c is vowel\n",ch);
} else{
    printf("%c is not vowel",ch);
}

    return 0;
}