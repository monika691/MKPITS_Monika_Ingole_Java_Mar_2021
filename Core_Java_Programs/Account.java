/*Another Example of Encapsulation in Java

Let's see another example of encapsulation that has only four fields with its setter and getter methods.
Account prt 1
 */
package com.mkpits.java.encpsultion;

 class Account {
     //private data member
     private long acno;
     private String name,email;
     private float amt;
     //public getter and setter method
     public long getacno(){
         return acno;
     }
     public void setacno(long acno){
         this.acno=acno;
     }
     public String getName(){
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }
     public String getEmail(){
         return email;
     }
     public void setEmail(String email){
         this.email=email;
     }
     public float getAmt(){
         return amt;
     }

     public void setAmt(float amt) {
         this.amt = amt;
     }
 }
