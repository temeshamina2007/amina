import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    private static final String URL = "jdbc:postgresql://localhost:5432/airline";
    private static final String USER = "postgres";
    private static final String PASSWORD = "";

    public static Connection getConnection() {
        try {
            Connection c = DriverManager.getConnection(URL, USER, PASSWORD);
            c.setAutoCommit(true);
            return c;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
