package com.mkpits.java.accessmodifier;
class Person{
    private String name;
    public void getname(String name){
        this.name=name;
    }
    public void displayname(){
        System.out.println("name is " +name);
    }
}
public class PrivateModEx2 {
    public static void main(String[] args) {
        Person p=new Person();
        //p.name="amit";shows error
        p.getname("amit");
        p.displayname();
    }
}
