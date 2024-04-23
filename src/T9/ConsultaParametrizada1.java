package T9;

import java.sql.*;
import java.util.Scanner;

public class ConsultaParametrizada1 {
        public static void main(String[] args) {
            String url1="jdbc:mysql://localhost/concesionario";
            String usuario="concesionario";
            String password="Concesionario";
            Scanner sc=new Scanner(System.in);
            System.out.println("Marca:");
            String marca=sc.nextLine();
            System.out.println("Año:");
            int anio= sc.nextInt();
            try {
                Connection cnx= DriverManager.getConnection(url1,usuario,password);
                PreparedStatement statement = cnx.prepareStatement("select * from coche where marca=? and anio=? and not vendido");
                statement.setString(1,marca);
                statement.setInt(2,anio);
                ResultSet rs=statement.executeQuery();
                while (rs.next()){
                    System.out.println(rs.getString("marca"));
                    System.out.println(rs.getDate("anio"));
                }
                statement.close();
                cnx.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
}

