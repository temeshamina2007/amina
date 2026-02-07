import java.sql.Connection;

public class testdb {
    public static void main(String[] args) {
        Connection c = DBConnection.getConnection();
        if (c != null) {
            System.out.println("CONNECTED");
        } else {
            System.out.println("NOT CONNECTED");
        }
    }
}
