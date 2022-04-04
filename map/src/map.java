import java.sql.Connection;
import java.sql.SQLException;

public class map {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        jdbc j = new jdbc();
        Class.forName("com.mysql.jdbc.Driver");
        Connection c1 = j.conn;
        System.out.println(c1);
    }
}
