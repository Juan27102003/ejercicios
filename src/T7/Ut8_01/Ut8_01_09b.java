package T7.Ut8_01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ut8_01_09b {
    public static void main(String[] args) {
        JFrame ventana = new JFrame();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(640, 480);
        ventana.setTitle("Prueba de ActionListener");
        ventana.setLayout(new FlowLayout());
        JButton boton = new JButton("¡Hola!");
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton b=(JButton) e.getSource();
                b.setText("¡Mundo!");
            }
        });
        ventana.add(boton);
        ventana.setVisible(true);
    }
}
