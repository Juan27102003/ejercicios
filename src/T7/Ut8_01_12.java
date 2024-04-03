package T7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ut8_01_12 {
    public static void main(String[] args) {
        JFrame ventana=new JFrame("Accediendo a otros componentes");
        ventana.setSize(640,100);
        JPanel panelSuperior=new JPanel();
        JButton boton1=new JButton("Lunes");
        JButton boton2=new JButton("Martes");
        JButton boton3=new JButton("Miércoles");
        JButton boton4=new JButton("Jueves");
        JButton boton5=new JButton("Viernes");
        JButton boton6=new JButton("Sábado");
        JTextField texto=new JTextField("Pulsa un boton");

        DiasActionListener listener=new DiasActionListener(texto);
        panelSuperior.add(boton1);
        panelSuperior.add(boton2);
        panelSuperior.add(boton3);
        panelSuperior.add(boton4);
        panelSuperior.add(boton5);
        panelSuperior.add(boton6);

        boton1.addActionListener(listener);
        boton2.addActionListener(listener);
        boton3.addActionListener(listener);
        boton4.addActionListener(listener);
        boton5.addActionListener(listener);
        boton6.addActionListener(listener);

        panelSuperior.setLayout(new FlowLayout());
        JPanel panelInferior=new JPanel();
        panelInferior.setLayout(new GridLayout(1,1));


        panelInferior.add(texto);

        ventana.add(panelSuperior,BorderLayout.PAGE_START);
        ventana.add(panelInferior,BorderLayout.PAGE_END);

        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}
class DiasActionListener implements ActionListener{
    private final JTextField text;

    public DiasActionListener(JTextField text) {
        this.text = text;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton boton=(JButton) e.getSource();
        String s=boton.getText();
        text.setText(s);
    }
}