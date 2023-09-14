package db;

import java.sql.Connection;
import java.sql.*;

public class DbConnection{
    String userOr="scott";
    String mdpOr="tiger";
    String urlOr="jdbc:oracle:thin:@localhost:1521:xe";

    String urlPg = "jdbc:postgresql://localhost/diagramme";      
    String userPg = "postgres";      
    String mdpPg = "root";

    public Connection connect() throws Exception{
        Class.forName("org.postgresql.Driver");
        Connection conn=DriverManager.getConnection(urlPg, userPg, mdpPg);
        conn.setAutoCommit(false);
        
        return conn;
    }
}