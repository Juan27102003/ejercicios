package T7.Ut8_02;

import javax.swing.*;
import java.awt.event.*;


public class Ut8_02_01 {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("ut8_02_01");
        ventana.setSize(640, 480);
        ventana.setVisible(true);
        ventana.setName("Principal");
        ventana.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println(e);
            }
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println(e);
            }
            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println(e);
            }
        });
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
