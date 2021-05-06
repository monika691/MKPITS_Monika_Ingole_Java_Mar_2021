/*Java AWT MenuItem and Menu Example

 */
package com.java.mkpits;

import java.awt.*;

public class AwtMenuEx1 {
    AwtMenuEx1(){
        Frame f=new Frame("Menu and Menuitem example");
        MenuBar mb=new MenuBar();
        Menu m=new Menu("Menu");
        Menu sm=new Menu("Submenu");
        MenuItem i1=new MenuItem("item1");
        MenuItem i2=new MenuItem("item2");
        MenuItem i3=new MenuItem("item3");
        MenuItem i4=new MenuItem("item4");
        MenuItem i5=new MenuItem("item5");
        m.add(i1);
        m.add(i2);
        m.add(i3);
        sm.add(i4);
        sm.add(i5);
        m.add(sm);
        mb.add(m);
        f.setMenuBar(mb);
        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);


    }

    public static void main(String[] args) {
        new AwtMenuEx1();
    }
}
