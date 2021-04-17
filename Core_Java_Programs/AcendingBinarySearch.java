/*/-wap to create array 10 elements accept 10 no. from the user and store it in an array
// then accept a no. from the user to search in an array.by Binary search)enter number in asending order

 */
package com.mkpits.java.clanguage;
import java.util.*;
public class AcendingBinarySearch {
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        int num[] =new int[10];
        int cnt;
        int low=0,high=9,mid,nts;

        for(cnt=0;cnt<9;cnt++) {
            System.out.println("Enter any number");
            num[cnt] = sc.nextInt();
        }
        System.out.println("Enter number to be search");
        nts = sc.nextInt();
        while(low<=high)
        {
            mid=(low+high)/2;
            if(num[mid]==nts)
            {
                System.out.println("Entered number" + "=" + nts + "found in array at position "+ " = " +mid);
                break;
            }
            else
            {
                if(num[mid]<nts)

                    low=mid+1;

                if(num[mid] > nts)

                    high=mid-1;

            }
        }
        if(low>high)
        {
            System.out.println("number not found in an array");
        }

    }
}
