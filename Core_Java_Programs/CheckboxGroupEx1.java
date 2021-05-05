/*Java AWT CheckboxGroup Example

 */
package com.mkpits.java.checkboxgroup;
import java.awt.*;
public class CheckboxGroupEx1 {
    CheckboxGroupEx1(){
        Frame f=new Frame("chekboxgroup example");
        CheckboxGroup cbg=new CheckboxGroup();
        Checkbox cb1=new Checkbox("c++",cbg,false);
        cb1.setBounds(100,100,50,50);
        Checkbox cb2=new Checkbox("java",cbg,true);
        cb2.setBounds(100,150,50,50);
        f.add(cb1);
        f.add(cb2);
        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new CheckboxGroupEx1();
    }
}
