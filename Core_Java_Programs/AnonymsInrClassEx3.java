/*Java anonymous inner class example3 using interface
 */
package com.mlpits.java.anonymsinnerclass;
interface eatable{
    void eat();
        }
public class AnonymsInrClassEx3 {
    public static void main(String[] args) {
        eatable e=new eatable() {
            public void eat() {
                System.out.println("nice fruits");
            }
        };
        e.eat();
    }
}
