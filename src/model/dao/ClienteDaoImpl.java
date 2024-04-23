package model.dao;

import Datasource.DataSource;
import model.entities.Cliente;
import model.entities.Coche;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteDaoImpl implements ClienteDao{
    private Connection connection;

    public ClienteDaoImpl(Connection connection) {
        this.connection = connection;
    }

    public ClienteDaoImpl() {
    }

    @Override
    public List<Cliente> findAll() {
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Cliente> clientes = null;
        try {
            ps = connection.prepareStatement("select * from cliente");
            rs = ps.executeQuery();
            clientes = new ArrayList<>();
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setNif(rs.getString("nif"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido1(rs.getString("apellido1"));
                cliente.setApellido2(rs.getString("apellido2"));
                cliente.setDireccion(rs.getString("direccion"));
                cliente.setCiudad(rs.getString("ciudad"));
                cliente.setC_postal(rs.getString("c_postal"));
                cliente.setTelefono(rs.getString("telefono"));
                clientes.add(cliente);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }finally {
            DataSource.closeStatement(ps);
            DataSource.closeResultSet(rs);
        }
        return clientes;
    }

    @Override
    public List<Cliente> findByCriteria(String nombre, String apellido1,String apellido2) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Cliente> clientes = null;
        try {
            ps = connection.prepareStatement("select  * from cliente where nombre=? and apellido1=? and apellido2=?");
            rs = ps.executeQuery();
            ps.setString(1,nombre);
            ps.setString(2,apellido1);
            ps.setString(3,apellido2);
            clientes = new ArrayList<>();
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setNif(rs.getString("nif"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido1(rs.getString("apellido1"));
                cliente.setApellido2(rs.getString("apellido2"));
                cliente.setDireccion(rs.getString("direccion"));
                cliente.setCiudad(rs.getString("ciudad"));
                cliente.setC_postal(rs.getString("c_postal"));
                cliente.setTelefono(rs.getString("telefono"));
                clientes.add(cliente);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }finally {
            DataSource.closeStatement(ps);
            DataSource.closeResultSet(rs);
        }
        return clientes;
    }

    @Override
    public Cliente findById(String nif) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Cliente cliente = null;
        try {
            ps = connection.prepareStatement("select * from cliente where nif = ?");
            ps.setString(1,nif);
            rs = ps.executeQuery();
            if(rs.next()) {
                cliente=new Cliente();
                cliente.setNif(rs.getString("nif"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido1(rs.getString("apellido1"));
                cliente.setApellido2(rs.getString("apellido2"));
                cliente.setDireccion(rs.getString("direccion"));
                cliente.setCiudad(rs.getString("ciudad"));
                cliente.setC_postal(rs.getString("c_postal"));
                cliente.setTelefono(rs.getString("telefono"));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            DataSource.closeStatement(ps);
            DataSource.closeResultSet(rs);
        }
        return cliente;
    }

    @Override
    public Cliente save(Cliente cliente) {
        return null;
    }

    @Override
    public void updateCliente(Cliente cliente) {

    }

    @Override
    public void delete(Cliente cliente) {

    }
}

