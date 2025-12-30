import java.util.Objects;

public class Flight {
    private String flightNumber;
    private String from;
    private String to;
    private String fromTime;
    private String toTime;
    private int allSeats;
    private int bookedSeats;

    public Flight(String flightNumber, String from, String to,
                  String fromTime, String toTime, int allSeats) {
        this.flightNumber = flightNumber;
        this.from = from;
        this.to = to;
        this.fromTime = fromTime;
        this.toTime = toTime;
        this.allSeats = allSeats;
        this.bookedSeats = 0;
    }

    public String getFlightNumber() { return flightNumber; }
    public String getFrom() { return from; }
    public String getTo() { return to; }
    public int getAvailable() { return allSeats - bookedSeats; }

    public boolean bookOneSeat() {
        if (getAvailable() > 0) {
            bookedSeats++;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Flight{number='" + flightNumber +
                "', from='" + from +
                "', to='" + to +
                "', availableSeats=" + getAvailable() + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;
        Flight flight = (Flight) o;
        return flightNumber.equals(flight.flightNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightNumber);
    }
}
