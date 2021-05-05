/*Java AWT Button Example

 */
package com.mkpits.java.buttonexample;
import java.awt.*;
public class ButtonEx1 {
    public static void main(String[] args) {
        Frame f=new Frame("Button Example");
        Button b=new Button("clicked here");
        b.setBounds(50,100,80,30);
        f.add(b);
        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);
    }
}
