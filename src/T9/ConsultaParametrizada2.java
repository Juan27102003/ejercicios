package T9;

import java.sql.*;
import java.util.Scanner;

public class ConsultaParametrizada2 {
    public static void main(String[] args) throws SQLException {
        String url1 = "jdbc:mysql://localhost/concesionario";
        String usuario = "concesionario";
        String password = "Concesionario";
        Scanner sc = new Scanner(System.in);
        System.out.println("Matricula:");
        String matricula = sc.nextLine();
        System.out.println("Descuento:");
        int desscuento = sc.nextInt();
        PreparedStatement statement = null;
        Connection cnx = null;
        try {
            cnx = DriverManager.getConnection(url1, usuario, password);
            statement = cnx.prepareStatement("update coche set precio=precio-precio*?/100 where matricula=?");
            statement.setString(2, matricula);
            statement.setInt(1, desscuento);
            int filas = statement.executeUpdate();
            if (filas > 0) {
                System.out.println("Se ha aplicado el descuento");
            } else System.out.println("Matricula incorrecta");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            statement.close();
            cnx.close();
        }
    }
}
