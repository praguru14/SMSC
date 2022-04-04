package src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbc {
    String url ="jdbc:mysql://localhost:3306/practice";
    String user = "ecommerceapp";
    String pass = "ecommerceapp";
    Connection conn = DriverManager.getConnection(url,user,pass);

    public jdbc() throws SQLException {
    }
}
