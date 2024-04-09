package T7.Ut8_02;

import T7.UsuarioClaveDialog;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ut8_02_09 {
    public static void main(String[] args) {
        JFrame ventana=new JFrame();
        ventana.setSize(640,480);
        ventana.setLayout(new FlowLayout());
        JButton btnEntrar=new JButton("Entrar");
        btnEntrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UsuarioClaveDialog ucd=new UsuarioClaveDialog(ventana,true);
            }
        });
        ventana.setVisible(true);
        ventana.add(btnEntrar);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
