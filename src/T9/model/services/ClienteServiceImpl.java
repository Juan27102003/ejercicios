package T9.model.services;

import T9.model.dao.ClienteDao;
import T9.model.dao.DAOFactory;
import T9.model.entities.Cliente;

import java.util.List;

public class ClienteServiceImpl implements ClienteService{
    private ClienteDao dao;
    public ClienteServiceImpl() {
        dao = DAOFactory.createClienteDao();
    }
    @Override
    public List<Cliente> findAll() {
        return dao.findAll();
    }

    @Override
    public List<Cliente> findByCriteria(String nombre, String apellido1,String apellido2) {
        return dao.findByCriteria(nombre, apellido1,apellido2);
    }

    @Override
    public Cliente findById(String nif) {
        return dao.findById(nif);
    }

    @Override
    public Cliente save(Cliente cliente) {
        return dao.save(cliente);
    }

    @Override
    public void updateCliente(Cliente cliente) {
        dao.updateCliente(cliente);
    }

    @Override
    public void delete(Cliente cliente) {
        dao.delete(cliente);
    }
}

