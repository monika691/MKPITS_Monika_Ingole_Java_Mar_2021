/*Java AWT Scrollbar Example with AdjustmentListener

 */
package com.java.mkpits;
import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class AwtScrollbarEx2 {
    AwtScrollbarEx2(){
        Frame f=new Frame();
        final Label l=new Label();
        l.setAlignment(Label.CENTER);
        l.setSize(400,100);

        Scrollbar s=new Scrollbar();
        s.setBounds(100,100,50,100);
        f.add(s);f.add(l);
        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);

        s.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                l.setText("vertical scrollbar value is : " +s.getValue());
            }
        });
    }

    public static void main(String[] args) {
        new AwtScrollbarEx2();
    }
}
