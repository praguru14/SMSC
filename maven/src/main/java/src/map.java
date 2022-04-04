package src;

import java.sql.Connection;
import java.sql.SQLException;

public class map {
    public static void main(String[] args) throws SQLException {
        jdbc j = new jdbc();
        Connection c1 = j.conn;
        System.out.println(c1);
    }
}
