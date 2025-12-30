import java.util.Objects;

public class Reservation {
    private String bookId;
    private Passenger passenger;
    private Flight flight;
    private double price;

    public Reservation(String bookId, Passenger passenger, Flight flight, double price) {
        this.bookId = bookId;
        this.passenger = passenger;
        this.flight = flight;
        this.price = price;
    }

    public String getBookId() { return bookId; }
    public Passenger getPassenger() { return passenger; }
    public Flight getFlight() { return flight; }

    @Override
    public String toString() {
        return "Reservation{id='" + bookId +
                "', passenger=" + passenger +
                ", flight=" + flight.getFlightNumber() +
                ", price=" + price + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Reservation)) return false;
        Reservation that = (Reservation) o;
        return bookId.equals(that.bookId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId);
    }
}
