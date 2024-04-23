package T9;

import java.sql.*;

public class Conexion2 {
    public static void main(String[] args) {
        String url1="jdbc:mysql://localhost/concesionario";
        String usuario="concesionario";
        String password="Concesionario";
        try {
            Connection cnx= DriverManager.getConnection(url1,usuario,password);
            Statement statement = cnx.createStatement();
            ResultSet rS = statement.executeQuery("select count(*) as cochesTotales from coche where precio between 20000 and 100000");
            System.out.println("************************************");
            while (rS.next()){
                System.out.println(rS.getString("cochesTotales"));
                System.out.println("************************************");
            }
            statement.close();
            cnx.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
