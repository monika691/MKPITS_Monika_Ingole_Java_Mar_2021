//5- delcare a struture book having members bookno, bookname, author, price

#include<stdio.h>
#include<string.h>
struct book
{
    int bookno;
    char bookname[20];
    char author[20];
    double price;
};
int main()
{
    struct book b1;
    printf("Enter book number\n");
    scanf("%d",&b1.bookno);
    printf("Enter book name\n");
    scanf("%s",&b1.bookname);
    printf("Enter author\n");
    scanf("%s",&b1.author);
    printf("Enter price\n");
    scanf("%lf",&b1.price);

printf("book details are:\n");

    printf("bookno=%d\n",b1.bookno);
    printf("bookname=%s\n",b1.bookname);
    printf("author=%c\n",b1.author);
    printf("price=%lf\n",b1.price);
    
    
    return 0;
}