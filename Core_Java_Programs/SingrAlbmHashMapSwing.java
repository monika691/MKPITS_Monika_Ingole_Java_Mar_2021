/*10 create a hashmap collection to create list of singer album using swing

 */
package com.mkpits.java.collection;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

class album{
    String singer,album;
    album(String singer,String album){
        this.singer=singer;
        this.album=album;
    }
}
public class SingrAlbmHashMapSwing extends JFrame {
    JLabel l1,l2,l3,l4;
    JButton b1,b2,b3;
    JTextField tf1,tf2,tf3,tf4;
    JTextArea ta;
    HashMap<String, String> map=new HashMap<String, String>();
    SingrAlbmHashMapSwing(){
        l1=new JLabel("Singer");
        l1.setBounds(10,50,100,30);
        add(l1);
        tf1=new JTextField();
        tf1.setBounds(110,50,100,30);
        add(tf1);

        l2=new JLabel("Album");
        l2.setBounds(10,100,100,30);
        add(l2);
        tf2=new JTextField();
        tf2.setBounds(110,100,100,30);
        add(tf2);

        b1=new JButton("Add");
        b1.setBounds(20,150,80,30);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                map.put( tf1.getText() , "\n" + tf2.getText());

                tf1.setText(" ");
                tf2.setText(" ");

            }
        });add(b1);

        b2=new JButton("Display");
        b2.setBounds(110,150,80,30);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder sb=new StringBuilder();
                for (Map.Entry<String, String> m:map.entrySet()) {
                    String key = m.getKey();
                    String s = m.getValue();
                    sb.append(m.getKey() + " " + m.getValue());
                    ta.setText(sb.toString());
                }
            }
        });add(b2);

        b3=new JButton("replace");
        b3.setBounds(200,150,80,30);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                map.replace(tf2.getText(), tf1.getText());



            }
        });add(b3);

        ta=new JTextArea("Details");
        ta.setBounds(10,200,200,200);
        add(ta);

        setLayout(null);
        setSize(500,500);
        setVisible(true);
    }

    public static void main(String[] args) {

        SingrAlbmHashMapSwing sa = new SingrAlbmHashMapSwing();
    }

}

