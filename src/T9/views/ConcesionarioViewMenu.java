package T9.views;

import T9.model.entities.Cliente;
import T9.model.entities.Coche;
import T9.model.services.ClienteService;
import T9.model.services.ClienteServiceImpl;
import T9.model.services.CocheService;
import T9.model.services.CocheServiceImpl;

import javax.swing.*;
import java.sql.Date;
import java.util.List;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ConcesionarioViewMenu extends JFrame{
    private JTable listadoTable;
    private JScrollPane scrollPane;

    private JPanel formPanel;
    private JPanel botonPanel;

    JTextField _matricula;
    JTextField _marca;
    JTextField _modelo;
    JTextField _anio;
    JTextField _precio;
    JCheckBox _vendido;

    private CocheService service;

    public ConcesionarioViewMenu(){
        service = new CocheServiceImpl();
        setTitle("Listado de Coches");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("Archivo");
        JMenuItem exitMenuItem = new JMenuItem("Salir");
        exitMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


        JMenuItem showCarsMenuItem = new JMenuItem("Coches");
        showCarsMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showCars();
            }
        });

        JMenuItem showClientesMenuItem = new JMenuItem("Clientes");
        showClientesMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showClientes();
            }
        });

        fileMenu.add(showCarsMenuItem);
        fileMenu.add(showClientesMenuItem);
        fileMenu.addSeparator();
        fileMenu.add(exitMenuItem);
        menuBar.add(fileMenu);


        setJMenuBar(menuBar);

        listadoTable = new JTable();
        scrollPane = new JScrollPane(listadoTable);


        listadoTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int selectedRow = listadoTable.getSelectedRow();
                if (selectedRow >= 0) {
                    showCarForm(selectedRow);
                }
            }
        });


        formPanel = new JPanel(new GridLayout(3, 2));

        formPanel.setBorder(BorderFactory.createTitledBorder("Detalles del Coche"));
        formPanel.add(new JLabel("Matricula:"));
        _matricula = new JTextField();
        formPanel.add(_matricula);

        formPanel.add(new JLabel("Marca:"));
        _marca = new JTextField();
        formPanel.add(_marca);

        formPanel.add(new JLabel("Modelo:"));
        _modelo = new JTextField();
        formPanel.add(_modelo);

        formPanel.add(new JLabel("Año:"));
        _anio = new JTextField();
        formPanel.add(_anio);

        formPanel.add(new JLabel("Precio:"));
        _precio = new JTextField();
        formPanel.add(_precio);

        formPanel.add(new JLabel("Vendido:"));
        _vendido = new JCheckBox();
        formPanel.add(_vendido);


        getContentPane().add(scrollPane, BorderLayout.CENTER);
        getContentPane().add(formPanel, BorderLayout.SOUTH);
        formPanel.setVisible(false);

        botonPanel=new JPanel(new FlowLayout());
        JButton botonLimpiar=new JButton("Limpiar");
        JButton botonNuevo =new JButton("Nuevo");
        JButton botonActualizar =new JButton("Actualizar");
        JButton botonEliminar =new JButton("Eliminar");
        botonPanel.add(botonNuevo);
        botonPanel.add(botonActualizar);
        botonPanel.add(botonEliminar);
        botonPanel.add(botonLimpiar);
        botonPanel.setVisible(false);

        JPanel panel=new JPanel();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        panel.add(formPanel);
        panel.add(botonPanel);
        getContentPane().add(panel,BorderLayout.SOUTH);
        showCarsMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setVisible(true);
            }
        });
        showClientesMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setVisible(false);
            }
        });
        botonNuevo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Coche coche=new Coche();
                coche.setMatricula(_matricula.getText());
                coche.setMarca(_marca.getText());
                coche.setModelo(_modelo.getText());
                coche.setAnio(Date.valueOf(_anio.getText()));
                coche.setPrecio(Double.parseDouble(_precio.getText()));
                coche.setVendido(_vendido.isSelected());
                service.save(coche);
                showCars();
            }
        });

        botonLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                _matricula.setText("");
                _marca.setText("");
                _modelo.setText("");
                _anio.setText("");
                _precio.setText("");
                _vendido.setSelected(false);
            }
        });
        botonEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow=listadoTable.getSelectedRow();
                DefaultTableModel model= (DefaultTableModel) listadoTable.getModel();
                String matricula = (String) model.getValueAt(selectedRow, 0);
                Coche coche= service.findById(matricula);
                service.delete(coche);
                showCars();
            }
        });

        botonActualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow=listadoTable.getSelectedRow();
                DefaultTableModel model= (DefaultTableModel) listadoTable.getModel();
                String matricula = (String) model.getValueAt(selectedRow, 0);
                Coche coche= service.findById(matricula);
                coche.setMatricula(_matricula.getText());
                coche.setMarca(_marca.getText());
                coche.setModelo(_modelo.getText());
                coche.setAnio(Date.valueOf(_anio.getText()));
                coche.setPrecio(Double.parseDouble(_precio.getText()));
                coche.setVendido(_vendido.isSelected());
                service.updateCoche(coche);
                showCars();
            }
        });
    }

    private void showCars() {

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Matricula");
        model.addColumn("Marca");
        model.addColumn("Modelo");
        model.addColumn("Año");
        model.addColumn("Precio");
        model.addColumn("Vendido");

        service = new CocheServiceImpl();

        List<Coche> coches = service.findAll();

        for (Coche coche : coches) {
            model.addRow(new Object[]{
                    coche.getMatricula(),
                    coche.getMarca(),
                    coche.getModelo(),
                    coche.getAnio(),
                    coche.getPrecio(),
                    coche.isVendido()
            });
        }

        listadoTable.setModel(model);
        botonPanel.setVisible(true);

        formPanel.setVisible(true);

    }

    private void showClientes() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("nif");
        model.addColumn("Nombre");
        model.addColumn("1º Apellido");
        model.addColumn("2º Apellido");
        model.addColumn("Direccion");
        model.addColumn("Ciudad");
        model.addColumn("Codigo postal");
        model.addColumn("Telefono");

        ClienteService service = new ClienteServiceImpl();

        List<Cliente> clientes = service.findAll();

        for (Cliente cliente : clientes) {
            model.addRow(new Object[]{
                    cliente.getNif(),
                    cliente.getNombre(),
                    cliente.getApellido1(),
                    cliente.getApellido2(),
                    cliente.getDireccion(),
                    cliente.getCiudad(),
                    cliente.getC_postal(),
                    cliente.getTelefono()
            });
        }

        listadoTable.setModel(model);
    }


    private void showCarForm(int rowIndex) {
        DefaultTableModel model = (DefaultTableModel) listadoTable.getModel();
        String matricula = (String) model.getValueAt(rowIndex, 0);

        Coche coche = service.findById(matricula);

        _matricula.setText(coche.getMatricula());
        _marca.setText(coche.getMarca());
        _modelo.setText(coche.getModelo());
        _precio.setText(String.valueOf(coche.getPrecio()));
        _anio.setText(String.valueOf(coche.getAnio()));
        _vendido.setSelected(coche.isVendido());

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ConcesionarioViewMenu example = new ConcesionarioViewMenu();
            example.setVisible(true);
        });
    }
}
