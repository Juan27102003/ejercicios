package T7.Ut8_02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ut8_02_30 {
    public static void main(String[] args) {
        JFrame ventana=new JFrame("Ut8_02_30");
        Action actSalir=new AccionSalir();
        ventana.setSize(640,480);
        JMenuBar menuBar=new JMenuBar();
        JMenu menu=new JMenu("Archivo");
        JMenuItem nuevo=new JMenuItem("Nuevo");
        JMenu reciente=new JMenu("Reciente");
        JMenuItem prueba=new JMenuItem("prueba.txt");
        JMenuItem ejemplo=new JMenuItem("ejemplo.dat");
        JMenuItem abrir=new JMenuItem("Abrir");
        JMenuItem cerrar=new JMenuItem("Cerrar");
        JMenuItem imprimir=new JMenuItem("Imprimir");
        JMenuItem salir=new JMenuItem(actSalir);
        JButton boton=new JButton(actSalir);
        ventana.setLayout(new FlowLayout());
        boton.setText("Salir");
        salir.setText("Salir");
        menuBar.add(menu);
        menu.add(nuevo);
        menu.add(reciente);
        reciente.add(prueba);
        reciente.add(ejemplo);
        menu.add(abrir);
        menu.add(cerrar);
        menu.addSeparator();
        menu.add(imprimir);
        menu.addSeparator();
        menu.add(salir);
        ventana.setJMenuBar(menuBar);
        ventana.add(boton, BorderLayout.CENTER);


        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}
