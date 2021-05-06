/*Java AWT Scrollbar Example

 */
package com.java.mkpits;
import java.awt.*;
public class AwtScrollbarEx1 {
    AwtScrollbarEx1(){
        Frame f=new Frame("Scrollbar Example");
        Scrollbar s=new Scrollbar();
        s.setBounds(100,100,50,100);
        f.add(s);
        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new AwtScrollbarEx1();
    }
}
