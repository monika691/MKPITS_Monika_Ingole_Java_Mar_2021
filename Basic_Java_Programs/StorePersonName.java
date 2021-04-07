/*12 - wap to create a string array of 5 elements to store 5 person name.

 */
package com.mkpits.java.basicprogram;
import java.util.*;
public class StorePersonName {
    public static void main(String[] args)
    {
        String name[]=new String[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.println("Enter name");
            name[i]=sc.next();

        }
        for(int i=0;i<5;i++) {
            System.out.println("name is " + name[i]);
        }
                }
}
