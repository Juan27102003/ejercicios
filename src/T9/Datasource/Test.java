package T9.Datasource;

import java.sql.Connection;
import java.sql.SQLException;

public class Test {
    public static void main(String[] args) throws SQLException {
        Connection connection=DataSource.getConnection();
        if (!connection.isClosed()){
            System.out.println("Conexion realizada correctamente");
        }

        connection.close();

        if (connection.isClosed()){
            System.out.println("Conexion cerrada correctamente");
        }

    }
}
