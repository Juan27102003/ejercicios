package T9.views;

import T9.model.entities.Coche;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class JTableModel {
    public static void main(String[] args) {
        JFrame ventana=new JFrame("Tabla Coche");
        JMenuBar menuBar=new JMenuBar();
        JMenu Tablas=new JMenu("Tablas");
        JMenuItem Coches=new JMenuItem("Coches");
        JMenuItem clientes=new JMenuItem("Clientes");
        JMenuItem salir=new JMenuItem("Salir");
        Tablas.add(Coches);
        Tablas.add(clientes);
        Tablas.addSeparator();
        Tablas.add(salir);
        menuBar.add(Tablas);

        List<Coche> coches=new ArrayList<>();

        coches.add(new Coche("1325GUJ","BMW","X1"));
        coches.add(new Coche("5431HJJ","Mercedes","Benz"));
        coches.add(new Coche("5246NHG","Toyota","Supra"));

        DefaultTableModel model=new DefaultTableModel();
        model.addColumn("Matricula");
        model.addColumn("Marca");
        model.addColumn("Modelo");

        for (Coche c: coches) {
            Object[] datos={c.getMatricula(),c.getMarca(),c.getModelo()};
            model.addRow(datos);
        }
        JTable tabla=new JTable(model);

        JScrollPane panel=new JScrollPane(tabla);
        panel.setVisible(false);
        salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        Coches.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setVisible(true);
            }
        });

        ventana.setSize(640,480);
        ventana.setJMenuBar(menuBar);
        ventana.add(panel);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
