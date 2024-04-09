package T7.Ut8_02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class Ut8_02_18 {
    public static void main(String[] args) {
        JFrame ventana=new JFrame("Ut8_02_18");
        String [] meses={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        JList<String> listaMeses=new JList<>(meses);
        JScrollPane scrollPane=new JScrollPane(listaMeses);
        listaMeses.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        ventana.setSize(640,480);
        ventana.add(scrollPane);
        JButton boton=new JButton("Mostar seleccionados");
        JPanel panelInferior=new JPanel();
        panelInferior.setLayout(new GridLayout(1,1));
        panelInferior.add(boton);
        ventana.add(panelInferior,BorderLayout.PAGE_END);
        boton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(listaMeses.getSelectedValuesList());
            }
        });

        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
