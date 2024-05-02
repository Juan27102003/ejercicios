package T9.model.dao;

import T9.Datasource.DataSource;
import T9.model.entities.Coche;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CocheDaoImpl implements CocheDao{
    private Connection connection;

    public CocheDaoImpl(Connection connection) {
        this.connection = connection;
    }

    public CocheDaoImpl() {
    }

    @Override
    public List<Coche> findAll() {
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Coche> coches = null;
        try {
            ps = connection.prepareStatement("select  * from coche");
            rs = ps.executeQuery();
            coches = new ArrayList<>();
            while (rs.next()) {
                Coche coche = new Coche();
                coche.setMatricula(rs.getString("matricula"));
                coche.setMarca(rs.getString("marca"));
                coche.setModelo(rs.getString("modelo"));
                coche.setAnio(rs.getDate("anio"));
                coche.setPrecio(rs.getDouble("precio"));
                coche.setVendido(rs.getBoolean("vendido"));
                coches.add(coche);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }finally {
            DataSource.closeStatement(ps);
            DataSource.closeResultSet(rs);
        }
        return coches;
    }

    @Override
    public List<Coche> findByCriteria(String marca, String modelo) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Coche> coches = null;
        try {
            ps = connection.prepareStatement("select  * from coche where marca=? and modelo=?");
            rs = ps.executeQuery();
            ps.setString(1,marca);
            ps.setString(2,modelo);
            coches = new ArrayList<>();
            while (rs.next()) {
                Coche coche = new Coche();
                coche.setMatricula(rs.getString("matricula"));
                coche.setMarca(rs.getString("marca"));
                coche.setModelo(rs.getString("modelo"));
                coche.setAnio(rs.getDate("anio"));
                coche.setPrecio(rs.getDouble("precio"));
                coche.setVendido(rs.getBoolean("vendido"));
                coches.add(coche);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }finally {
            DataSource.closeStatement(ps);
            DataSource.closeResultSet(rs);
        }
        return coches;
    }

    @Override
    public Coche findById(String matricula) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Coche coche = null;
        try {
            coche = new Coche();
            ps = connection.prepareStatement("select * from coche where matricula=?");
            ps.setString(1, matricula);
            rs = ps.executeQuery();
            while (rs.next()) {

                coche.setMatricula(rs.getString("matricula"));
                coche.setMarca(rs.getString("marca"));
                coche.setModelo(rs.getString("modelo"));
                coche.setAnio(rs.getDate("anio"));
                coche.setPrecio(rs.getDouble("precio"));
                coche.setVendido(rs.getBoolean("vendido"));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            DataSource.closeStatement(ps);
            DataSource.closeResultSet(rs);
        }
        return coche;
    }

    @Override
    public Coche save(Coche coche) {
        PreparedStatement ps = null;

        try {
            String sql = "insert into coche (matricula, marca, modelo, anio, precio, vendido) values (?, ?, ?, ?, ?, ?)";
            ps = connection.prepareStatement(sql);
            ps.setString(1, coche.getMatricula());
            ps.setString(2, coche.getMarca());
            ps.setString(3, coche.getModelo());
            ps.setInt(4, coche.getAnio().getYear()+1900);
            ps.setDouble(5, coche.getPrecio());
            ps.setBoolean(6, coche.isVendido());

            int fila = ps.executeUpdate();



        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            DataSource.closeStatement(ps);
        }
        return coche;
    }

    @Override
    public void updateCoche(Coche coche) {
        PreparedStatement ps = null;

        try {
            String sql = "update coche set marca = ? , modelo = ?, anio = ?, precio = ?, vendido = ? where matricula = ?";
            ps = connection.prepareStatement(sql);
            ps.setString(1, coche.getMarca());
            ps.setString(2, coche.getModelo());
            ps.setInt(3, coche.getAnio().getYear()+1900);
            ps.setDouble(4, coche.getPrecio());
            ps.setBoolean(5, coche.isVendido());
            ps.setString(6, coche.getMatricula());

            ps.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            DataSource.closeStatement(ps);
        }
    }

    @Override
    public void delete(Coche coche) {
        PreparedStatement ps = null;

        try {
            String sql = "delete from coche where matricula = ?";
            ps = connection.prepareStatement(sql);
            ps.setString(1, coche.getMatricula());

            ps.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            DataSource.closeStatement(ps);
        }
    }
}
