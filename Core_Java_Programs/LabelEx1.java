/*Java Label Example

 */
package com.mkpits.java.labelexample;
import java.awt.*;
public class LabelEx1 {
    public static void main(String[] args) {
        Frame f=new Frame();
        Label l1,l2;
        l1=new Label("first label");
        l1.setBounds(50,100,100,30);

        l2=new Label("second label");
        l2.setBounds(50,150,100,30);
        f.add(l1);
        f.add(l2);
        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);
    }
}
