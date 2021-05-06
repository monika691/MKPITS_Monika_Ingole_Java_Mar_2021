/*Java AWT List Example

 */
package com.java.mkpits;
import java.awt.*;
public class AwtListEx1 {
    AwtListEx1(){
        Frame f=new Frame();
        List l=new List(5);
        l.setBounds(100,100,75,75);
        l.add("Item 1");
        l.add("Item 2");
        l.add("Item 3");
        l.add("Item 4");
        l.add("Item 5");

        f.add(l);
        f.setLayout(null);
        f.setSize(300,300);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new AwtListEx1();
    }
}
