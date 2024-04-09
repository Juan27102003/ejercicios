package T7.Ut8_02;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

public class Ut8_02_05 {
    public static void main(String[] args) {
        JFrame ventana=new JFrame("Activa");
        ventana.setSize(640,480);
        ventana.setAlwaysOnTop(true);
        ventana.addWindowFocusListener(new WindowFocusListener() {
            @Override
            public void windowGainedFocus(WindowEvent e) {
                ventana.setTitle("Activa");
            }

            @Override
            public void windowLostFocus(WindowEvent e) {
                ventana.setTitle("Inactiva");
            }
        });
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
