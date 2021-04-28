/*Methods of Object class

 */
package com.mkpits.java.methodofjava;
class Parent{

}
public class tob extends Parent{
    public static void main(String[] args) {
        Parent p=new tob();
        Object obj=p.getClass();
        System.out.println("obj " +obj);

    }
}
