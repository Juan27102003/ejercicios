package T9.views;

import T9.model.entities.Coche;
import T9.model.services.CocheService;
import T9.model.services.CocheServiceImpl;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class CocheView  extends JPanel {

    static final String USERNAME = "root";
    static final String PASSWORD = "root";
    static final String CONN_STRING = "jdbc:mysql://localhost:3306/mydbtest?useSSL=false";

    JTable jt;
    public CocheView () {

        CocheService service = new CocheServiceImpl();

        List<Coche> list = service.findAll();

        Object[] header = new Object[]{"Matrícula", "Marca", "Modelo"};
        DefaultTableModel tableModel = new DefaultTableModel(header, 0);

        for (Coche coche: list) {
            tableModel.addRow(new Object[]{coche.getMatricula(), coche.getMarca(), coche.getModelo()});
        }


        jt = new JTable(tableModel);

        jt.setPreferredScrollableViewportSize(new Dimension(450, 63));
        jt.setFillsViewportHeight(true);

        JScrollPane jps = new JScrollPane(jt);
        add(jps);

    }

    public static void main(String[] args) {
        JFrame jf = new JFrame();
        CocheView t = new CocheView();
        jf.setTitle("Test");
        jf.setSize(500,500);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(t);
    }
}