package T7.Ut8_02;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ut8_02_19b {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("ut8_02_19a");
        DefaultListModel<String> elementos = new DefaultListModel<>();
        JList<String> lstListaCentral = new JList<>(elementos);
        lstListaCentral.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JPanel pnlSuperior = new JPanel(new GridLayout(1, 2));
        JTextField txtItem = new JTextField(30);
        JButton btnAgregar = new JButton("Agregar");
        btnAgregar.setEnabled(false);
        ActionListener agregarActionListener = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                elementos.addElement(txtItem.getText());
                txtItem.setText("");
            }
        };
        btnAgregar.addActionListener(agregarActionListener);
        txtItem.addActionListener(agregarActionListener);
        txtItem.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                hayCambio(e);
            }
            @Override
            public void removeUpdate(DocumentEvent e) {
                hayCambio(e);
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                hayCambio(e);
            }
            private void hayCambio(DocumentEvent e) {
                btnAgregar.setEnabled(e.getDocument().getLength() > 0);
            }
        });
        pnlSuperior.add(txtItem);
        JPanel pnlInferior = new JPanel(new GridLayout(1, 2));
        JButton btnEliminar = new JButton("Eliminar");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (lstListaCentral.getSelectedIndex() >= 0) {
                    elementos.remove(lstListaCentral.getSelectedIndex());
                }
            }
        });
        JButton btnVaciar = new JButton("Vaciar");
        btnVaciar.setEnabled(false);
        btnVaciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                elementos.clear();
            }
        });
        lstListaCentral.addListSelectionListener(new ListSelectionListener(){
            @Override
            public void valueChanged(ListSelectionEvent e) {
                btnEliminar.setEnabled(lstListaCentral.getSelectedIndex() >= 0);
            }
        });
        elementos.addListDataListener(new ListDataListener(){
            @Override
            public void intervalAdded(ListDataEvent e) {
                comprobarLista();
            }
            @Override
            public void intervalRemoved(ListDataEvent e) {
                comprobarLista();
            }
            @Override
            public void contentsChanged(ListDataEvent e) {
                comprobarLista();
            }
            private void comprobarLista() {
                btnVaciar.setEnabled(elementos.size() > 0);
            }
        });
        pnlInferior.add(btnEliminar);
        pnlInferior.add(btnVaciar);
        pnlSuperior.add(txtItem);
        pnlSuperior.add(btnAgregar);
        ventana.add(pnlSuperior, BorderLayout.PAGE_START);
        JScrollPane scrLista = new JScrollPane(lstListaCentral);
        ventana.add(scrLista, BorderLayout.CENTER);
        ventana.add(pnlInferior, BorderLayout.PAGE_END);
        ventana.setSize(640, 480);
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}
