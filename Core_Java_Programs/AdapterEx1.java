package com.mkpits.java.adapter;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class AdapterEx1 extends Frame {
   public AdapterEx1(){
        addMouseListener(new MyMouseAdapter(this));
        addMouseMotionListener(new MyMouseMotionAdapter(this));
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        AdapterEx1 ad= new AdapterEx1();

    }
}
class MyMouseAdapter extends MouseAdapter{
    AdapterEx1 ad;
    public MyMouseAdapter(AdapterEx1 ad){
        this.ad=ad;
    }
    public void mouseClicked(MouseEvent me){
        System.out.println("mouse clicked "+me.getX()+","+me.getY());
    }
}
class MyMouseMotionAdapter extends MouseMotionAdapter{
    AdapterEx1 ad;
   public MyMouseMotionAdapter(AdapterEx1 ad){
        this.ad=ad;
    }
    public void mouseDragged(MouseEvent me){
        System.out.println("mouse dragged ");
    }
}
