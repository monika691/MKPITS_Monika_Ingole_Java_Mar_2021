/*Java AWT Choice Example

 */
package com.mkpits.java.choice;
import java.awt.*;
public class ChoiceEx1 {
    ChoiceEx1(){
        Frame f=new Frame();
        Choice c=new Choice();
        c.setBounds(100,100,75,75);
        c.add("Item 1");
        c.add("Item 2");
        c.add("Item 3");
        c.add("Item 4");
        f.add(c);
        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new ChoiceEx1();
    }
}
