/*Java AWT Toolkit Example: Change TitleBar Icon

 */
package com.java.mkpits;

import javax.swing.*;
import java.awt.*;

public class AwtToolkitEx3 {
    AwtToolkitEx3() {
        Frame f = new Frame();
        Image icon = Toolkit.getDefaultToolkit().getImage("e:\\crop.jpg");
        f.setIconImage(icon);
        f.setLayout(null);
        f.setSize(300,300);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new AwtToolkitEx3();
    }
}
