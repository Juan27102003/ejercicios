package T7.Ut8_02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;

public class Ut8_02_03 {
    public static void main(String[] args) {
        JFrame ventana=new JFrame("Ut8_02_03");
        ventana.setSize(640,480);
        ventana.setLayout(new FlowLayout());

        JLabel etiquetaX=new JLabel();
        JLabel etiquetaY=new JLabel();
        ventana.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                int x=e.getX();
                int y=e.getY();
                etiquetaX.setText("X:"+x);
                etiquetaY.setText("Y:"+y);
            }
        });

        ventana.add(etiquetaX);
        ventana.add(etiquetaY);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}
