/*Java AWT TextArea Example
 */
package com.mkpits.java.textarea;
import java.awt.*;
public class TextAreaEx1 {
    TextAreaEx1(){
        Frame f=new Frame();
        TextArea area=new TextArea("welcome to java");
        area.setBounds(10,30,300,300);
        f.add(area);
        f.setLayout(null);
        f.setSize(300,300);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new TextAreaEx1();
    }
}
