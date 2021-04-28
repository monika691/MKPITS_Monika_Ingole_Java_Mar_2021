/*example of default modifier

 */
package com.mkpits.java.accessmodifier;
class Person2{
    String name;//default access midifier
    void msg(){System.out.println("Hello " +name);}
    public void getname(String name){
        this.name=name;
        msg();
    }
    public void displayname(){
        System.out.println("name is " +name);
    }
}
public class DefalultModEx {
    public static void main(String[] args) {
        Person2 p=new Person2();
        //p.msg();
        p.getname("amit");
        p.displayname();
    }
}

