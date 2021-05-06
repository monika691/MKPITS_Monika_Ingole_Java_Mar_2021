/*Java AWT Toolkit Example

 */
package com.java.mkpits;

import java.awt.*;

public class AwtToolkitEx1 {
    public static void main(String[] args) {
        Toolkit t=Toolkit.getDefaultToolkit();
        System.out.println("screen resolution " + t.getScreenResolution());
        Dimension d=t.getScreenSize();
        System.out.println("screen width " + d.width);
        System.out.println("screen height " +d.height);
    }
}
