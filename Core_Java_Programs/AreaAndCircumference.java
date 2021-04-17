/*14 wap to accept radius and then calculate and print area and circumference of a circle
        (area = 3.14f * radius * radius, circ= 2 * 3.14f * radius)

 */
package com.mkpits.java.clanguage;

import java.util.*;

public class AreaAndCircumference {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int radius;
        float area,cir;
        System.out.println("Enter radius");
        radius= sc.nextInt();
        area = 3.14f*radius*radius;
        cir=2*3.14f*radius;
        System.out.println("area of circle = " +area);
        System.out.println("cir of circle = " +cir);
    }
}
