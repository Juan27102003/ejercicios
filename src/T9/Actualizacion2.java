package T9;

import java.sql.*;

public class Actualizacion2 {
    public static void main(String[] args) {
        String url1="jdbc:mysql://localhost/concesionario";
        String usuario="concesionario";
        String password="Concesionario";
        try {
            Connection cnx= DriverManager.getConnection(url1,usuario,password);
            Statement statement = cnx.createStatement();
            int filas = statement.executeUpdate("update coche set precio=precio*1.05 where anio<1965");
            System.out.println("Se han actualizado "+filas+" coches");

            statement.close();
            cnx.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
