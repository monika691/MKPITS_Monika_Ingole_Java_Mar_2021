/*Java Member inner class example
In this example, we are creating msg() method in member inner class that is accessing the private data member of outer class.
 */
package com.mlpits.java.memberinnerclass;

public class OuterClass {
    private int num = 20;
    class inner{
        void msg() {
            System.out.println("num " + num);
        }
    }

    public static void main(String[] args) {
OuterClass obj=new OuterClass();
OuterClass.inner in=obj.new inner();
in.msg();
    }
}