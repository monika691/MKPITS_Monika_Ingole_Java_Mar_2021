/*wap to accept length, breadth and height and calculate and display volume

 */

package com.mkpits.java.clanguage;
import java.util.*;
public class LengthBreadth {
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        int length,breadth,height;
        float volume;
        System.out.println("Enter length,breadth,height");
        length= sc.nextInt();
        breadth= sc.nextInt();
        height= sc.nextInt();

        volume =length *breadth*height;
        System.out.println("volume = " + volume);
    }
}
