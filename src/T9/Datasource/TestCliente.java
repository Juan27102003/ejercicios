package T9.Datasource;

import T9.model.dao.ClienteDao;
import T9.model.dao.DAOFactory;
import T9.model.entities.Cliente;

import java.util.List;

public class TestCliente {
    public static void main(String[] args) {
        ClienteDao dao = DAOFactory.createClienteDao();

        List<Cliente> all = dao.findAll();
        for (Cliente c: all) {
            System.out.println(c);
        }

        System.out.println("*******************************Criteria******************************");
        List<Cliente> byCriteria = dao.findByCriteria("Irene", "Vera","Gallego");
        for (Cliente c: byCriteria) {
            System.out.println(c);
        }

        System.out.println("*******************************findById******************************");
        System.out.println(dao.findById("26000000H"));


        System.out.println("*******************************Insert******************************");
        Cliente cliente = new Cliente();
        cliente.setNif("26000001G");
        cliente.setNombre("Pepe");
        cliente.setApellido1("García");
        cliente.setApellido2("Martínez");
        cliente.setCiudad("Granada");
        cliente.setDireccion("Calle Mina la rosa");
        cliente.setC_postal("23200");
        cliente.setTelefono("982345671");
        dao.save(cliente);
        System.out.println(cliente);

        System.out.println("*******************************Update******************************");
        Cliente cliente1 = new Cliente();
        cliente.setNif("26000001G");
        cliente.setNombre("Irene");
        cliente.setApellido1("Vera");
        cliente.setApellido2("Gallego");
        cliente.setCiudad("Jaén");
        cliente.setDireccion("Calle Mina la rosa");
        cliente.setC_postal("23200");
        cliente.setTelefono("900000000");
        dao.updateCliente(cliente1);
        System.out.println(cliente1);

        System.out.println("*******************************Delete******************************");
        dao.delete(cliente1);

    }
}
