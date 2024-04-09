package T7.Ut8_02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ut8_02_06 {
    public static void main(String[] args) {
        JFrame ventana=new JFrame("Ut8_02_06");
        ventana.setSize(640,480);
        ventana.setLayout(new GridLayout(8,8));
        for (int i=1;i<=64;i++){
            JLabel etiqueta=new JLabel("Marcame");
            etiqueta.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    etiqueta.setForeground(Color.RED);
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    etiqueta.setForeground(null);
                }
            });
            ventana.add(etiqueta);
        }

        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
