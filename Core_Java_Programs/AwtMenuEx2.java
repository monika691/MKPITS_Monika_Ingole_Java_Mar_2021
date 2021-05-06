/*Java AWT MenuItem and Menu Example

 */
package com.java.mkpits;

import java.awt.*;
import java.io.FileReader;

public class AwtMenuEx2 {
    AwtMenuEx2(){
        Frame f=new Frame("Menu and MenuItem");
        MenuBar mb=new MenuBar();
        Menu menu=new Menu("File");
        Menu sm=new Menu("Project");
        MenuItem i1=new MenuItem("New");
        MenuItem i2=new MenuItem("Open");
        MenuItem i3=new MenuItem("close");
        MenuItem i4=new MenuItem("Rename");
        MenuItem i5=new MenuItem("delete");
        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        sm.add(i4);
        sm.add(i5);
        menu.add(sm);
        mb.add(menu);
        f.setMenuBar(mb);

        Menu menu1=new Menu("Edit");
        MenuItem i6=new MenuItem("copy");
        MenuItem i7=new MenuItem("cut");
        MenuItem i8=new MenuItem("paste");
        menu1.add(i6);
        menu1.add(i7);
        menu1.add(i8);
        mb.add(menu1);
        f.setMenuBar(mb);
        f.setLayout(null);
        f.setSize(400,300);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new AwtMenuEx2();
    }
}
