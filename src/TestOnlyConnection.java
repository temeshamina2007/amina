import java.sql.DriverManager;

public class TestOnlyConnection {
    public static void main(String[] args) throws Exception {
        DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/airline",
                "postgres",
                ""
        );
        System.out.println("CONNECTED");
    }
}
