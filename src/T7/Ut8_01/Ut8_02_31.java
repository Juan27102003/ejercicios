package T7.Ut8_01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Ut8_02_31 {
    public static void main(String[] args) {
        File directorio=new File("C:/Users/estudiante/Desktop/Imagenes");
        JFrame ventana=new JFrame();
        ventana.setSize(640,480);
        ventana.setLayout(new GridLayout(1,3));
        JPanel panel1=new JPanel();
        JPanel panel2=new JPanel();
        JPanel panel3=new JPanel();
        JMenuBar menuBar=new JMenuBar();
        JMenu archivo=new JMenu("Archivo");
        JMenuItem vaciar=new JMenuItem("Vaciar");
        JMenuItem salir=new JMenuItem("Salir");
        JMenu imagenes=new JMenu("Imágenes");
        ventana.setJMenuBar(menuBar);
        menuBar.add(archivo);
        archivo.add(vaciar);
        archivo.addSeparator();
        archivo.add(salir);
        menuBar.add(imagenes);
        DefaultListModel<String> elementos=new DefaultListModel<>();
        JList<String> lista=new JList<>(elementos);
        JScrollPane scrollPane=new JScrollPane(lista);
        JButton botonEliminar=new JButton("Eliminar");
        JButton botonVaciar=new JButton("Vaciar");
        File[] archivos=directorio.listFiles();
        for (File f: archivos){
            if (f.getName().toLowerCase().endsWith(".jpg"))
            imagenes.add(new JMenuItem(f.getName()));
            imagenes.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                }
            });
        }
        panel1.setLayout(new GridLayout(1,1));
        panel1.add(scrollPane,BorderLayout.EAST);
        panel2.add(botonEliminar);
        panel2.add(botonVaciar);
        panel2.setLayout(new FlowLayout());
        JLabel etiqueta=new JLabel();
        panel3.add(etiqueta);
        ventana.add(panel1);
        ventana.add(panel2);
        ventana.add(panel3);

        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}
