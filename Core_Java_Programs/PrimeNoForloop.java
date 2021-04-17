/*wap to print prime no between 1 and 20

 */
package com.mkpits.java.clanguage;
//import java.util.*;
public class PrimeNoForloop {
    public static void main(String[] arg) {
        //Scanner sc = new Scanner(System.in);
        int num,cnt;
        for(num=2;num<20;num++)
        {
            for(cnt=2;cnt<=num;cnt++)
            {
                if(num==cnt)
                    System.out.println(+num);

                else if (num % cnt == 0)
                    break;

            }
        }
    }
}
