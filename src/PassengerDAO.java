import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PassengerDAO {

    public static void addPassenger(Passenger p) {
        String sql = "INSERT INTO passengers (passport_number, first_name, last_name) VALUES (?, ?, ?)";
        try (Connection c = DBConnection.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setString(1, p.getPassportNumber());
            ps.setString(2, p.getFirstName());
            ps.setString(3, p.getLastName());
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<Passenger> getAllPassengers() {
        List<Passenger> list = new ArrayList<>();
        String sql = "SELECT passport_number, first_name, last_name FROM passengers";

        try (Connection c = DBConnection.getConnection();
             Statement st = c.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                list.add(new Passenger(
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getString("passport_number")
                ));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public static void updateLastName(String passport, String newLastName) {
        String sql = "UPDATE passengers SET last_name = ? WHERE passport_number = ?";
        try (Connection c = DBConnection.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setString(1, newLastName);
            ps.setString(2, passport);
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void deletePassenger(String passport) {
        String sql = "DELETE FROM passengers WHERE passport_number = ?";
        try (Connection c = DBConnection.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setString(1, passport);
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
