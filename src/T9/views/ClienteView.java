package T9.views;

import T9.model.entities.Cliente;
import T9.model.services.ClienteService;
import T9.model.services.ClienteServiceImpl;

import  java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ClienteView extends JPanel {
    public ClienteView() {

        ClienteService service = new ClienteServiceImpl();
        List<Cliente> list = service.findAll();

        Object[] header = new Object[]{"Nombre", "1º Apellido", "2º Apellido"};
        DefaultTableModel tableModel = new DefaultTableModel(header, 0);

        for (Cliente cliente: list) {
            tableModel.addRow(new Object[]{cliente.getNombre(), cliente.getApellido1(), cliente.getApellido2()});
        }

        JTable jt = new JTable(tableModel);

        jt.setPreferredScrollableViewportSize(new Dimension(450, 63));
        jt.setFillsViewportHeight(true);

        JScrollPane jps = new JScrollPane(jt);
        add(jps);

    }

    public static void main(String[] args) {
        JFrame jf = new JFrame();
        ClienteView t = new ClienteView();
        jf.setTitle("Test");
        jf.setSize(500,500);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(t);
    }
}