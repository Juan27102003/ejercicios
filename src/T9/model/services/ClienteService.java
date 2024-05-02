package T9.model.services;

import T9.model.entities.Cliente;

import java.util.List;

public interface ClienteService {
    List<Cliente> findAll();
    List<Cliente> findByCriteria(String nombre,String apellido1,String apellido2);
    Cliente findById(String nif);
    Cliente save(Cliente cliente);
    void updateCliente(Cliente cliente);
    void delete(Cliente cliente);
}
