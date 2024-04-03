package T7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ut8_01_11 {
    public static void main(String[] args) {
        JFrame ventana=new JFrame("Incrementando y decrementando");
        ventana.setSize(500,200);
        ventana.setLayout(new GridLayout());
        JButton boton1=new JButton("-1");
        JButton boton2=new JButton("0");
        JButton boton3=new JButton("+1");

        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s=boton2.getText();
                int i= Integer.parseInt(s);
                boton2.setText(String.valueOf(--i));
            }
        });

        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton b= (JButton) e.getSource();
                b.setText("0");
            }
        });
        boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s=boton2.getText();
                int i= Integer.parseInt(s);
                boton2.setText(String.valueOf(++i));
            }
        });
        ventana.add(boton1);
        ventana.add(boton2);
        ventana.add(boton3);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}