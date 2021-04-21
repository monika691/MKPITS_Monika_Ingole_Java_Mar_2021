/*Java Runtime Polymorphism with Data Member
In the example given below, both the classes have a data member speedlimit.
 */
package com.mkpits.java.polymorphism;

class Bike2{
    int speedlimit=90;
}
class Honda extends Bike2{
    int speedlimit = 150;
}
public class RunTimePolymorpsmEx5 {
    public static void main(String[] args) {
        Bike2 b=new Honda();
        System.out.println(b.speedlimit);
    }
}
