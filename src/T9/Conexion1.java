package T9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion1 {
    public static void main(String[] args) {
        String url1="jdbc:mysql://localhost/concesionario";
        String url2="jdbc:mysql://localhost:3306/concesionario";
        String url3="jdbc:mysql://[(host=localhost,port=3306,user=concesionario,password=Concesionario)]/concesionario";
        String usuario="concesionario";
        String password="Concesionario";
        try {
            //Connection cnx= DriverManager.getConnection(url1,usuario,password);
            //Connection cnx= DriverManager.getConnection(url2,usuario,password);
            Connection cnx= DriverManager.getConnection(url3);
            if (!cnx.isClosed()){
                System.out.println("Conexion realizada correctamente");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
