/*Write a program in C to calculate and print the Electricity bill of a given
        customer. The customer id., name and unit consumed by the user should be taken
        from the keyboard and display the total amount to pay to the customer.
        The charge are as follow :
        Unit 	Charge/unit
        upto 199 	@1.20
        200 and above but less than 400 	@1.50
        400 and above but less than 600 	@1.80
        600 and above 	@2.00

        If bill exceeds Rs. 400 then a surcharge of 15% will be charged
        and the minimum bill should be of Rs. 100/-

 */
package com.mkpits.java.clanguage;
import java.util.*;
public class PrintElectricBill {
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        int cust_id, unit;
        float total, bill = 0, sur_charge;
        String name;
        System.out.println("enter customer id\n");
        cust_id=sc.nextInt();

        System.out.println("Enter customer name\n");
        name=sc.next();

        System.out.println("Enter unit consumed\n");
        unit=sc.nextInt();

        if (unit <= 199)
        {
            bill = unit * 1.20f;
            System.out.println("bill amount :"+ bill);
        }
        else if (unit >= 200 && unit < 400)
        {
            bill = 199 * 1.20f + (unit - 200) * 1.50f;
            System.out.println("bill amount :"+ bill);
        }

        else if (unit >= 400 && unit < 600)
        {
            bill = 199 * 1.20f + 400 * 1.50f + (unit - 400) * 1.80f;
            System.out.println("bill amount :"+ bill);
        }

        else if (unit >= 600)
        {
            bill = 199 * 1.20f + 400 * 1.50f + 600 * 1.80f + (unit - 600) * 2.00f;
            System.out.println("bill amount :"+ bill);
        }

        sur_charge = bill * 0.15f;
        total = bill + sur_charge;
        System.out.println("total bill is = Rs." + total);

    }
}
