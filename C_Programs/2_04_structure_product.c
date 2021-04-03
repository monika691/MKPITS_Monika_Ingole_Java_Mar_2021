//6-create a structure product having members prodid,prodname, price

#include <stdio.h>
#include<string.h>

int main()
{
    struct product
    {
        int id;
        char name[20];
        double price;
    } prod1;

   strcpy(prod1.name,"maggi");
   prod1.id=105;
   prod1.price=45;

   printf("id=%d\n",prod1.id);
   printf("name=%s\n",prod1.name);
   printf("price=%lf\n",prod1.price);
    return 0;
}