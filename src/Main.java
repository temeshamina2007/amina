import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Flight> flights = new ArrayList<>();
        List<Passenger> passengers = new ArrayList<>();
        List<Reservation> reservations = new ArrayList<>();

        flights.add(new Flight("FL001", "Astana", "Almaty", "10:00", "12:00", 50));
        flights.add(new Flight("FL002", "Astana", "Dubai", "14:00", "20:00", 100));
        flights.add(new Flight("FL003", "Almaty", "Istanbul", "09:00", "15:00", 80));

        System.out.println("Enter passenger first name:");
        String firstName = scanner.nextLine();

        System.out.println("Enter passenger last name:");
        String lastName = scanner.nextLine();

        System.out.println("Enter passport number:");
        String passport = scanner.nextLine();

        Passenger passenger = new Passenger(firstName, lastName, passport);
        passengers.add(passenger);

        System.out.println("Enter destination city:");
        String destination = scanner.nextLine();

        List<Flight> filteredFlights = new ArrayList<>();
        for (Flight f : flights) {
            if (f.getTo().equalsIgnoreCase(destination)) {
                filteredFlights.add(f);
            }
        }

        if (filteredFlights.isEmpty()) {
            System.out.println("No flights found");
            return;
        }

        filteredFlights.sort(Comparator.comparing(Flight::getFlightNumber));

        Flight selectedFlight = filteredFlights.get(0);
        selectedFlight.bookOneSeat();

        Reservation reservation = new Reservation(
                UUID.randomUUID().toString(),
                passenger,
                selectedFlight,
                50000
        );

        reservations.add(reservation);

        System.out.println("Reservation created:");
        System.out.println(reservation);
    }
}
