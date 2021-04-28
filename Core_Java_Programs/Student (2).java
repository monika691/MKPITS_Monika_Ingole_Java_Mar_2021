/*Simple Example of Encapsulation in Java

Let's see the simple example of encapsulation that has only one field with its setter and getter methods.
student part1
 */
package com.mkpits.java.encpsultion;

public class Student {
    //private data member
    private String name;
    //getter method for name
    public String getname(){
        return name;
    }
    //setter method for name
    public void setName(String name){
        this.name=name;
    }
}
