// 8 Write a program in C to calculate and print the Electricity bill of a given
// customer. The customer id., name and unit consumed by the user should be taken
// from the keyboard and display the total amount to pay to the customer.
// The charge are as follow :
// Unit 	Charge/unit
// upto 199 	@1.20
// 200 and above but less than 400 	@1.50
// 400 and above but less than 600 	@1.80
// 600 and above 	@2.00

//  If bill exceeds Rs. 400 then a surcharge of 15% will be charged
// and the minimum bill should be of Rs. 100/-

#include <stdio.h>

int main()
{
    int cust_id, unit;
    float total, bill, sur_charge;
    char name[20];
    printf("enter customer id\n");
    scanf("%d", &cust_id);

    printf("Enter customer name\n");
    scanf("%s", &name);

    printf("Enter unit consumed\n");
    scanf("%d", &unit);

    if (unit <= 199)
    {
        bill = unit * 1.20;
        printf("bill amount :%f\n", bill);
    }
    else if (unit >= 200 && unit < 400)
    {
        bill = 199 * 1.20 + (unit - 200) * 1.50;
        printf("bill amount :%f\n", bill);
    }

    else if (unit >= 400 && unit < 600)
    {
        bill = 199 * 1.20 + 400 * 1.50 + (unit - 400) * 1.80;
        printf("bill amount :%f\n", bill);
    }

    else if (unit >= 600)
    {
        bill = 199 * 1.20 + 400 * 1.50 + 600 * 1.80 + (unit - 600) * 2.00;
        printf("bill amount :%f\n", bill);
    }

    sur_charge = bill * 0.15;
    total = bill + sur_charge;
    printf("total bill is = Rs.%.2f\n", total);

    return 0;
}
