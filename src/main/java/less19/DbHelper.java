package less19;

import lombok.SneakyThrows;

import java.sql.*;

public class DbHelper {
    @SneakyThrows(SQLException.class)
    public static Connection createConnection() {
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres?currentSchema=public",
                "root", "root");
        connection.setAutoCommit(false);
        return connection; //connection.prepareStatement(sql);
    }

}
