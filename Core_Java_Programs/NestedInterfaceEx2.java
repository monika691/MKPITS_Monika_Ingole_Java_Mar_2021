/*Example of nested interface which is declared within the interface

 */
package com.mlpits.java.nestedinterface;
class student{
    interface instudent{
        void msg();
    }interface instudent1{
        void msg1();
    }
}
 class NestedInterfaceEx2 implements student.instudent,student.instudent1 {

     public void msg() {
System.out.println("hello from msg");
     }
     public void msg1() {
System.out.println("hello from msg1");
     }

     public static void main(String[] args) {
         student.instudent si1=new NestedInterfaceEx2();
         si1.msg();
         student.instudent1 si2=new NestedInterfaceEx2();
         si2.msg1();
     }
 }