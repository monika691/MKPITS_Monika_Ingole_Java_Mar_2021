// 12 - wap to create  a character array of 5 elements
// accept 5 characters from the user
// and then display each character in a new line.
// then search in an array whether a vowel character is present in it or not

#include <stdio.h>

int main()
{
    char ch[5];
    int cnt;

    for (cnt = 0; cnt < 5; cnt++)
    {
        printf("Enter any character\n");
        scanf("%s",&ch[cnt]);
    }
    for(cnt=0;cnt<5;cnt++)
    {
        printf("\nentered character %d = %c",cnt,ch[cnt]);
    }
    for(cnt=0;cnt<5;cnt++)
    {
        if(ch[cnt]=='a')
        {
            printf("\n character %c on %d is a vowel",ch[cnt],cnt);
        }
    else if (ch[cnt]=='e')
    {
        printf("\ncharacter %c on %d is a vowel",ch[cnt],cnt);
    }
    
    else if(ch[cnt]=='i')
    {
        printf("\ncharacter %c on %d is a vowel",ch[cnt],cnt);
    }
     else if(ch[cnt]=='o')
    {
        printf("\ncharacter %c on %d is a vowel",ch[cnt],cnt);
    }
     else if(ch[cnt]=='u')
    {
        printf("\ncharacter %c on %d is a vowel",ch[cnt],cnt);
    }
  }
return 0;
}