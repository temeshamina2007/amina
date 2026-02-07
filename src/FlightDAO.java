import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FlightDAO {

    public static void addFlight(Flight f) {
        try (Connection c = DBConnection.getConnection();
             PreparedStatement ps = c.prepareStatement(
                     "INSERT INTO flights VALUES (?, ?, ?, ?, ?, ?, ?)")) {

            ps.setString(1, f.getFlightNumber());
            ps.setString(2, f.getFrom());
            ps.setString(3, f.getTo());
            ps.setString(4, f.getFromTime());
            ps.setString(5, f.getToTime());
            ps.setInt(6, f.getAvailable() + 0);
            ps.setInt(7, 0);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<Flight> getFlights() {
        List<Flight> list = new ArrayList<>();

        try (Connection c = DBConnection.getConnection();
             Statement st = c.createStatement();
             ResultSet rs = st.executeQuery("SELECT * FROM flights")) {

            while (rs.next()) {
                list.add(new Flight(
                        rs.getString("flight_number"),
                        rs.getString("from_city"),
                        rs.getString("to_city"),
                        rs.getString("from_time"),
                        rs.getString("to_time"),
                        rs.getInt("all_seats")
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
