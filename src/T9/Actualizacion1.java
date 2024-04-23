package T9;

import java.sql.*;

public class Actualizacion1 {
    public static void main(String[] args) {
        String url1="jdbc:mysql://localhost/concesionario";
        String usuario="concesionario";
        String password="Concesionario";
        try {
            Connection cnx= DriverManager.getConnection(url1,usuario,password);
            Statement statement = cnx.createStatement();
            int filas = statement.executeUpdate("update coche set vendido=true where matricula='ZA7777AB'");
            System.out.println("Se han actualizado "+filas+" coches");

            statement.close();
            cnx.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
