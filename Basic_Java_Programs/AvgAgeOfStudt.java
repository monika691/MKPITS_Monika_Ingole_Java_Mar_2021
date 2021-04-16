/*wap to accept age of 5 student calculate and display the average age using while loop.

 */
package com.mkpits.java.clanguage;
import java.util.*;
public class AvgAgeOfStudt {
    public static void main(String[] arg)
    {
        Scanner sc= new Scanner(System.in);
        int age,total=0;
        float avg;
        int cnt=1;
        while(cnt <=5)
        {
            System.out.println("Enter 5 children age");
            age= sc.nextInt();
            total=total+age;
            cnt++;

            avg = (total/5.0f);
            System.out.println("average of age =" + avg);


        }
    }
}
